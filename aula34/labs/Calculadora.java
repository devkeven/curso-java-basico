package com.keven.cursojava.aula34.labs;

public class Calculadora {
	
	public static double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double potencia(double base, double expoente) {
		return Math.pow(base, expoente);
			
	}
	
	public static int fatorial(int num) {
		int fatorial = 1;
		for(int i=num; i>0; i--) {
			fatorial *= i;
		}
		return fatorial;
	}

}
