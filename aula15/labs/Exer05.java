package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Insira a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7 && media <10) {
			System.out.println("Aprovado. " + media);
		} else if(media < 7) {
			System.out.println("Reprovado. " + media);
		} else if(media == 10) {
			System.out.println("Aprovado com distinção. " + media);
		}

	}

}
