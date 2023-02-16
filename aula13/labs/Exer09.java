package com.keven.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double grausCelsius, grausFarenheit;
		
		System.out.print("Insira a temperatura em graus Farenheit:");
		grausFarenheit = scan.nextDouble();
		
		grausCelsius = (5*(grausFarenheit-35) / 9);
		System.out.print("A temperatura em graus Celsius é " + grausCelsius);
		

	}

}
