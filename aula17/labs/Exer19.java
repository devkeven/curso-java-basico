package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o numero de notas");
		int numNotas = scan.nextInt();
		
		int totalNotas = 0;
		int media = 0;
		
		for(int i=1; i <= numNotas; i++) {
			System.out.println("Insira a " + i + "ª nota: ");
			totalNotas += scan.nextInt();
		}
		
		media = totalNotas/numNotas;
		System.out.println("A média é " + media + ".");

	}

}
