package br.edu.infnet.model;

/**
 * 
 * @author Fábio Silva
 *
 */

public class Usuario {
	
	private int id;
	private String login;
	private String senha;
	private boolean ativo;
	private PerfilEnum perfil;

	public Usuario(String login, String senha, PerfilEnum perfil) {
		this.login = login;
		this.senha = senha;
		this.ativo = true;
		this.perfil = perfil;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public PerfilEnum getPerfil() {
		return perfil;
	}
	public void setPerfil(PerfilEnum perfil) {
		this.perfil = perfil;
	}
}
