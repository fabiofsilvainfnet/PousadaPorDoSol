package br.edu.infnet.app;

import java.util.List;

import br.edu.infnet.model.PerfilEnum;
import br.edu.infnet.model.Usuario;
import dao.UsuarioDAO;

public class PousadaPorDoSol {

	public static void main(String[] args) {
		
		UsuarioDAO dao = new UsuarioDAO("usuario");	
//		List<Usuario> usuarios = dao.buscarTodos();
//		usuarios.forEach(usuario -> System.out.println(usuario.getLogin()));
		
//		usuarios = dao.buscarTodos();
//		usuarios.forEach(usuario -> System.out.println(usuario.getLogin()));
		
//		Usuario usuario = dao.buscar("fabiofs");
//		System.out.println(usuario.getLogin());	
		
		Usuario usuario = dao.buscar(1);
		System.out.println(usuario.getLogin());	
		
		dao.excluir(2);
		
		Usuario inclusao = new Usuario();
		inclusao.setLogin("root");
		inclusao.setSenha("abcdef");
		inclusao.setAtivo(true);
		inclusao.setPerfil(PerfilEnum.ADMINISTRADOR);
		
		dao.atualizar(inclusao, 3);
		
		List<Usuario> usuarios = dao.buscarTodos();
		usuarios.forEach(registro -> System.out.println(registro.getLogin()));
		
//		SegurancaService service = new SegurancaService();
//		Usuario usuario = new Usuario("fabiosilva", "123456", PerfilEnum.ADMINISTRADOR);
//				
//		usuario.setId(1);
//		
//		System.out.println("Imprimindo o objeto usu�rio.");
//		System.out.println("O id �: " + usuario.getId());
//		System.out.println("O login �: " + usuario.getLogin());		
//		System.out.println("O senha �: " + usuario.getSenha());		
//		System.out.println("O ativo �: " + usuario.isAtivo());	
//
//		boolean autenticado = service.logar(usuario.getLogin(), usuario.getSenha());
//		
//		if (autenticado)
//			System.out.println("Antenticado");
//		else 
//			System.out.println("N�o antenticado");
//		
//		
//		Usuario usuario2 = new Usuario("fulano", "ABCDEF", PerfilEnum.ADMINISTRADOR);
//
//		usuario2.setId(1);
//		
//		System.out.println("Imprimindo o segundo objeto usu�rio.");
//		System.out.println("O id �: " + usuario2.getId());
//		System.out.println("O login �: " + usuario2.getLogin());		
//		System.out.println("O senha �: " + usuario2.getSenha());		
//		System.out.println("O ativo �: " + usuario2.isAtivo());	
//
//		autenticado = service.logar(usuario2.getLogin(), usuario2.getSenha());
//		
//		if (autenticado)
//			System.out.println("Antenticado");
//		else 
//			System.out.println("N�o antenticado");
		
		
	}

}
