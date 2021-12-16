package br.edu.infnet.model;

import java.util.Date;

public class Reserva {

	private Integer id;
	private Quarto quarto;
	private Pessoa cliente;
	private PeriodoEnum periodo;
	private Date dataInicio;
	private Date dataFim;
	private boolean ativo;

	public Reserva(Pessoa cliente, Quarto quarto, PeriodoEnum periodo) {
		this.cliente = cliente;
		this.quarto = quarto;
		this.periodo = periodo;
		this.ativo = true;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public PeriodoEnum getPeriodo() {
		return periodo;
	}
	public void setPeriodo(PeriodoEnum periodo) {
		this.periodo = periodo;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
