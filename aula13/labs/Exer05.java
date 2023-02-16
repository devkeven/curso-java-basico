package com.keven.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	
		
		double metros, centimetros;
		
		
		System.out.println("Insira a quantia em metros: ");
		metros = scan.nextDouble();
		
		centimetros = metros * 100;
		
		System.out.println(metros + " metros é igual a " + centimetros + " centimetros.");

	}

}
