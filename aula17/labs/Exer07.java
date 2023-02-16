package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int inserido;
		int maior = Integer.MIN_VALUE;
		
		for(int i=0; i < 5; i++) {
			
			System.out.print("Insira o numero "+ i + ": " );
			inserido = scan.nextInt();
			
			if(inserido > maior) {
				maior = inserido;
			}
						
		}
		
			System.out.print("O maior é: " + maior);

	}

}
