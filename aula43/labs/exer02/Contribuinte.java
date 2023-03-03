package com.keven.cursojava.aula43.labs.exer02;

public abstract class Contribuinte {
		
	//Atributos
	private String nome;
	private double rendaBruta;
	
	//getters and setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	//Métodos
	public abstract double calcularImposto();
	
	
	//toString
	@Override
	public String toString() {
		String s = "Nome: " + nome;
		 s += " ;Renda Bruta: " + rendaBruta;
		 
		 return s;
	}
	
	
	

}
