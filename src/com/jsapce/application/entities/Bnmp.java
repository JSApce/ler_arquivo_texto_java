package com.jsapce.application.entities;

import java.io.Serializable;

public class Bnmp implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numeroProcesso;
	private String nome;
	private String orgaoExpedidor;

	public Bnmp() {
	}

	public Bnmp(String numeroProcesso, String nome, String orgaoExpedidor) {
		super();
		this.numeroProcesso = numeroProcesso;
		this.nome = nome;
		this.orgaoExpedidor = orgaoExpedidor;
	}

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}

	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}

	@Override
	public String toString() {
		return "Bnmp [numeroProcesso=" + numeroProcesso + ", nome=" + nome + ", orgaoExpedidor=" + orgaoExpedidor + "]";
	}

}
