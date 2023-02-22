package com.keven.Aula19.labs;

import java.util.Scanner;

/*
 * Mostrar todos os números pares de 0 até ao elemento do array
 */

public class Exer34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor do elemento " + i);
			vetorA[i] = scan.nextInt();
		}

		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.print("Números pares até " + vetorA[i] + ": ");
			for(int j = 0; j <= vetorA[i]; j++) {
				if(j % 2 == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		
	}

}
