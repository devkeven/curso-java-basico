package com.keven.cursojava.aula52.labs;

public class Contacto {
	
	private static int count;
	private String nome;
	private String telefone;
	private int id;
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}		
	public int getId() {
		return id;
	}
	public Contacto() {
		
		this.count++;
		this.id = count;
	}
	
	
	@Override
	public String toString() {
		String s = "[";
		s+= "Id: " + id;
		s+= ", Nome: " + nome;
		s+= ", Telefone: " + telefone + "]";	
		return s;
	}
	
	
	
	
	
	

}
