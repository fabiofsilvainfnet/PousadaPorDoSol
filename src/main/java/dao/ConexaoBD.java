package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	private static Connection conexao;
	
	public static Connection getConnection() {
		
		if (conexao == null) {
			criarConexao();
		}
		
		return conexao;
	}
	
	private static void criarConexao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/pousada", "root", "root");
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao carregar driver do banco de dados");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
