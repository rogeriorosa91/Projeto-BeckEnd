package br.com.rosacorp.projeto.dto;

public class AgenteHeaders {

	public int id_agente;
	public String nome_agente;
	
	public AgenteHeaders(int id_agente, String nome_agente) {
		super();
		this.id_agente = id_agente;
		this.nome_agente = nome_agente;
	}

	public int getId_agente() {
		return id_agente;
	}

	public void setId_agente(int id_agente) {
		this.id_agente = id_agente;
	}

	public String getNome_agente() {
		return nome_agente;
	}

	public void setNome_agente(String nome_agente) {
		this.nome_agente = nome_agente;
	}

	
}