package br.edu.infnet.service;

import br.edu.infnet.model.PerfilEnum;
import br.edu.infnet.model.Usuario;

public class SegurancaService {

	public boolean logar(String login, String senha) {
		Usuario usuario = new Usuario("fabiosilva", "123456", PerfilEnum.ADMINISTRADOR);
		return usuario.getSenha().equals(senha) && usuario.getLogin().equals(login); 
	}
	
}
