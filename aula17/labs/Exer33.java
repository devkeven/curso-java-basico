package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

/*
 * da para ter mais do que uma váriavel dentro do for
 */

public class Exer33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Insira o valor de n:");
		int n = scan.nextInt();
		double soma = 0;
		
		System.out.print("S = ");
		
		for(int i=1, j=1; i<=n; i++, j+=2) {
			System.out.print(i + "/" + j + " + ");
			
			soma += i/j;
		}
		System.out.println("A soma é " + soma);
		
	}

}
