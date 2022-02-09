package br.edu.infnet.service;

import br.edu.infnet.model.Usuario;
import dao.UsuarioDAO;

public class SegurancaService {

	public boolean logar(String login, String senha) {
		
		UsuarioDAO dao = new UsuarioDAO("usuario");
		Usuario usuario = dao.buscar(login);
		return usuario.getSenha().equals(senha) && usuario.getLogin().equals(login); 
	}
	
}
