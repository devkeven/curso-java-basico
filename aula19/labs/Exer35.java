package com.keven.Aula19.labs;

import java.util.Scanner;

/*
 * mostrar os divisores de cada número do vetor
 */

public class Exer35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor do elemento " + i);
			vetorA[i] = scan.nextInt();
		}

		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.print("Divisores de " + vetorA[i] + ": ");
			for(int j = 1; j <= vetorA[i]; j++) {
				if(vetorA[i] % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		
	}

}
