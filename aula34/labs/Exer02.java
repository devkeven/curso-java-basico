package com.keven.cursojava.aula34.labs;

/*
 * classe calculadora
 */

public class Exer02 {

	public static void main(String[] args) {
		
		double resultado;
		
		resultado = Calculadora.somar(10, 1);		
		System.out.println(resultado);
		
		resultado = Calculadora.subtrair(10, 1);		
		System.out.println(resultado);
		
		resultado = Calculadora.dividir(10, 2);		
		System.out.println(resultado);
		
		resultado = Calculadora.multiplicar(6, 2);		
		System.out.println(resultado);
		
		resultado = Calculadora.potencia(3, 2);		
		System.out.println(resultado);
		
		resultado = Calculadora.fatorial(0);		
		System.out.println(resultado);

	}

}
