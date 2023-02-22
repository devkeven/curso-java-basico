package com.keven.Aula19.labs;

import java.util.Scanner;

/*
 * vereficar se os elementos do vetor A são pares por no vertor B
 * se forem ímpares por no vetor C
 */

public class Exer30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[20];
		int[] vetorC = new int[20];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Insira o valor do elemento " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		int auxB = 0;
		int auxC = 0;
		int valorA;
		
		for(int i = 0; i < vetorA.length; i++) {
			valorA = vetorA[i];
			if(valorA % 2 == 0){
				vetorB[auxB] = valorA;
				auxB++;
			} else {
				vetorC[auxC] = valorA;
				auxC++;
			}			
		}//fim for
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < auxB; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i = 0; i < auxC; i++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}
