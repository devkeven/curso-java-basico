package com.keven.cursojava.aula39;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;	
	private String telemovel;
	
	protected  String nomeVisibilidade;
	
			
	public Pessoa(String nome, String endereco, String telefone, String cpf, String telemovel) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.telemovel = telemovel;
	}
	public Pessoa() {
	}
	public String getTelemovel() {
		return telemovel;
	}
	public void setTelemovel(String telemovel) {
		this.telemovel = telemovel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNomeVisibilidade(String nomeVisibilidade) {
		this.nomeVisibilidade = nomeVisibilidade;
	}
	
	
	
	

}
