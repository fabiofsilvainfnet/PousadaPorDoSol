package br.edu.infnet.model;

import java.util.List;

public class Quarto {

	private Integer id;
	private TipoQuartoEnum tipoQuarto;
	private String nome;
	private String descricao;
	private boolean ativo;
	private List<String> imagens;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TipoQuartoEnum getTipoQuarto() {
		return tipoQuarto;
	}
	public void setTipoQuarto(TipoQuartoEnum tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public List<String> getImagens() {
		return imagens;
	}
	public void setImagens(List<String> imagens) {
		this.imagens = imagens;
	}
		
}
