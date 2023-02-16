package com.keven.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	
		
		double nota1, nota2,nota3,nota4, media;
		
		System.out.println("Insira a primeira nota: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = scan.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		nota3 = scan.nextDouble();
		
		System.out.println("Insira a quarta nota: ");
		nota4 = scan.nextDouble();

		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média das quatro notas é " + media);

	}

}
