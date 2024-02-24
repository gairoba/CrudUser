package com.gairoba.crud.model.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {

//	private Long idEndereco;

	private String logradouro;

	private String numero;

	private String cidade;

	private String estado;

	private String cep;

	public Endereco() {

	}

	public Endereco(String logradouro, String numero, String cidade, String estado, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

//	public Long getIdEndereco() {
//		return idEndereco;
//	}
//
//	public void setIdEndereco(Long idEndereco) {
//		this.idEndereco = idEndereco;
//	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
