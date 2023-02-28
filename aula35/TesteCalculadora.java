package com.keven.cursojava.aula35;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int fatorianNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorianNR);
		
		int fatorial = Calculadora.fatorial(5);
		System.out.println(fatorial);

	}

}
