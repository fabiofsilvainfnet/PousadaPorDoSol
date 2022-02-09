package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class PadraoDAO<Entidade> {

	private Connection conexao;
	private String tabela;
	
	public PadraoDAO(String tabela) {
		this.conexao = ConexaoBD.getConnection();
		this.tabela = tabela;
	}
	
	public Connection getConnection() {
		return this.conexao;
	}
	
	public List<Entidade> buscarTodos() {
		
		List<Entidade> todos = new ArrayList<>();
		String sql = "select * from " + tabela;
		
		try (
				Statement comando = getConnection().createStatement();
				ResultSet resultado = comando.executeQuery(sql);
				) {
			while (resultado.next()) {
				todos.add(paraEntidade(resultado));
			}

		} catch (SQLException e) {
			System.out.println("Erro ao buscar os registros da tabela " + tabela);
			e.printStackTrace();
		}

		return todos;
	}
	
	public Entidade buscar(Integer id) {
		String sql = "select * from " + tabela + " where id = " + id;
		Entidade objeto = null;

		try (PreparedStatement comando = getConnection().prepareStatement(sql);
				ResultSet resultado = comando.executeQuery(sql);	) {
			
			while (resultado.next()) {
				objeto  = paraEntidade(resultado);
			}
		} catch (SQLException e) {
		}
		
		return objeto;
	}
	
	public boolean excluir(Integer id) {
		String sql = "update " + tabela + " set ativo = false where id = " + id;

		try (PreparedStatement comando = getConnection().prepareStatement(sql);) {
			comando.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
		
	}
	
	public boolean inserir(Entidade entidade) {
		String sql = "insert into " + tabela + " ( " + getCampos() + " ) values ( " + getValores(entidade) + " ) ";

		try (PreparedStatement comando = getConnection().prepareStatement(sql);) {
			comando.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
		
	}
	
	public boolean atualizar(Entidade entidade, Integer id) {
		
		Entidade novaEntidade = buscar(id);
		
		novaEntidade = popularEntidade(entidade, novaEntidade);
		
		String sql = "update " + tabela + " set " + getCamposValores(entidade) + " where id = " + id;
		
		try (PreparedStatement comando = getConnection().prepareStatement(sql);) {
			comando.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	protected abstract String getCamposValores(Entidade entidade);

	protected abstract Entidade popularEntidade(Entidade entidade, Entidade novaEntidade);

	protected abstract String getValores(Entidade entidade);

	protected abstract String getCampos();

	public abstract Entidade paraEntidade(ResultSet resultado);
	
}
