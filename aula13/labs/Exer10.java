package com.keven.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double grausCelsius, grausFarenheit;
		
		System.out.print("Insira a temperatura em graus Celsius:");
		grausCelsius = scan.nextDouble();
		
		grausFarenheit = (grausCelsius * 1.8) +32;
		
		System.out.print("A temperatura em graus Farenheit é " + grausFarenheit);

	}

}
