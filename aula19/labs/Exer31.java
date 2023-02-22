package com.keven.Aula19.labs;

import java.util.Scanner;

/*
 * Organizar o vetor B com valores pares e depois valores impares
 */

public class Exer31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Insira o valor do elemento " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		int countB = 0;
		//se for par por no vetor B
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				vetorB[countB] = vetorA[i];
				countB++;
			}
		}
		
		//se for impar por no vetor B
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				vetorB[countB] = vetorA[i];
				countB++;
			}
		}
		
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
