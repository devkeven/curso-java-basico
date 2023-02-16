package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int numero = scan.nextInt();
		
		int numFator = numero -1;		
		int fatorial = numero;
		
		System.out.print(numero + "! = " + numero);
		
		for(int i = numFator ; i > 0; i--) {
						
			fatorial = fatorial * numFator;
			System.out.print("." + numFator);
			numFator--;
			//System.out.println("Fatorial: " + fatorial);
			
			
			
		}
		
		System.out.print(" = " + fatorial);

	}

}
