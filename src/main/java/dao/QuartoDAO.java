package dao;

import java.sql.ResultSet;

import br.edu.infnet.model.Quarto;

public class QuartoDAO extends PadraoDAO<Quarto>{

	public QuartoDAO(String tabela) {
		super(tabela);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Quarto paraEntidade(ResultSet resultado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getValores(Quarto entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getCampos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getCamposValores(Quarto entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Quarto popularEntidade(Quarto entidade, Quarto novaEntidade) {
		// TODO Auto-generated method stub
		return null;
	}

}
