package com.keven.cursojava.aula34.labs;

/*
 * Contador
 */

public class Exer01 {
	
	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {
		
		imprimirValor();
		
		Contador cont = new Contador();		
		Contador cont2 = new Contador();
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.zerar();
		
		imprimirValor();
		
		Contador cont3 = new Contador();
		
		imprimirValor();

	}

}
