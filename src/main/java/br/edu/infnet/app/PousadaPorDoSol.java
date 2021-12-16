package br.edu.infnet.app;

import br.edu.infnet.model.PerfilEnum;
import br.edu.infnet.model.Usuario;
import br.edu.infnet.service.SegurancaService;

public class PousadaPorDoSol {

	public static void main(String[] args) {
		
		SegurancaService service = new SegurancaService();
		Usuario usuario = new Usuario("fabiosilva", "123456", PerfilEnum.ADMINISTRADOR);
				
		usuario.setId(1);
		
		System.out.println("Imprimindo o objeto usuário.");
		System.out.println("O id é: " + usuario.getId());
		System.out.println("O login é: " + usuario.getLogin());		
		System.out.println("O senha é: " + usuario.getSenha());		
		System.out.println("O ativo é: " + usuario.isAtivo());	

		boolean autenticado = service.logar(usuario.getLogin(), usuario.getSenha());
		
		if (autenticado)
			System.out.println("Antenticado");
		else 
			System.out.println("Não antenticado");
		
		
		Usuario usuario2 = new Usuario("fulano", "ABCDEF", PerfilEnum.ADMINISTRADOR);

		usuario2.setId(1);
		
		System.out.println("Imprimindo o segundo objeto usuário.");
		System.out.println("O id é: " + usuario2.getId());
		System.out.println("O login é: " + usuario2.getLogin());		
		System.out.println("O senha é: " + usuario2.getSenha());		
		System.out.println("O ativo é: " + usuario2.isAtivo());	

		autenticado = service.logar(usuario2.getLogin(), usuario2.getSenha());
		
		if (autenticado)
			System.out.println("Antenticado");
		else 
			System.out.println("Não antenticado");
		
		
	}

}
