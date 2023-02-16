package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
								
		System.out.print("Insira uma nota entre 0 e 10: ");
		int nota = scan.nextInt();
		
		while(nota <0 || nota >10) {
			
			System.out.print("Nota inválida, inrroduza novamente: ");
			nota = scan.nextInt();
		}
		
		System.out.println("Nota introduzida: " + nota);

	}

}
