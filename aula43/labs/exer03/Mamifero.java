package com.keven.cursojava.aula43.labs.exer03;

public class Mamifero extends Animal{
	
	//Atributos
	private String alimento;

	//get set
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	//toString
	@Override
	public String toString() {		
		String s = super.toString();
		s += "Alimento: " + alimento; 
		return s;
	}

}
