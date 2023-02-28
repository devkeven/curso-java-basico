package com.keven.cursojava.aula34.labs;

public class Contador {
	
	//Atributos
	private static int count;
	
	
	//constructor
	public Contador() {
		
		this.count++;
	}


	//Métodos
	public static void zerar() {
		count = 0;
	}
	
	public static void incrementar() {
		count++;
	}
	public static int obterValor() {
		return count;
	}

}
