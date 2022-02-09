package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.edu.infnet.model.Usuario;

public class UsuarioDAO extends PadraoDAO<Usuario> {
	
	
	public UsuarioDAO(String tabela) {
		super(tabela);
	}

	public Usuario buscar(String login) {
		String sql = "select * from usuario where login = '" + login + "'";
		Usuario usuario = null;
		try {

			PreparedStatement comando = getConnection().prepareStatement(sql);
			ResultSet resultado = comando.executeQuery(sql);
			
			while (resultado.next()) {
				usuario = new Usuario(
						resultado.getInt("id"),
						resultado.getString("login"),
						resultado.getString("senha"),
						resultado.getBoolean("ativo"),
						null
				);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usuario;
	}

	@Override
	public Usuario paraEntidade(ResultSet resultado) {
		Usuario usuario = null;
		
		
		try {
			usuario = new Usuario(
					resultado.getInt("id"),
					resultado.getString("login"),
					resultado.getString("senha"),
					resultado.getBoolean("ativo"),
					null				
			
				);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return usuario;
	}

	@Override
	protected String getValores(Usuario entidade) {
		return "'" + entidade.getLogin() + "', '" + entidade.getSenha() + "', " + entidade.isAtivo() + ", '" + entidade.getPerfil() + "'";
	}

	@Override
	protected String getCampos() {
		return "login, senha, ativo, perfil";
	}

	@Override
	protected Usuario popularEntidade(Usuario entidade, Usuario novaEntidade) {
		novaEntidade.setId(entidade.getId());
		novaEntidade.setLogin(entidade.getLogin());
		novaEntidade.setSenha(entidade.getSenha());
		novaEntidade.setAtivo(entidade.isAtivo());
		novaEntidade.setPerfil(entidade.getPerfil());
		return novaEntidade;
	}

	@Override
	protected String getCamposValores(Usuario entidade) {
		return " login = '" + entidade.getLogin() + "', senha = '" + entidade.getSenha() + "', ativo = " + entidade.isAtivo() + 
				", perfil = '" + entidade.getPerfil() + "'";
	}

}
