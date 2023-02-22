package com.keven.Aula19.labs;

import java.util.Scanner;

/*
 * comparar dois vetores se:
 *  A > B  -- C = 1
 *  A = B  -- C = 0
 *  A < B  -- C = -1
 */

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		int valorA, valorB;
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print("Insira o valor do elemento " + i  + ": ");
			vetorB[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorC.length; i++) {
			valorA = vetorA[i];
			valorB = vetorB[i];
			
			if(valorA > valorB) {
				vetorC[i] = 1;
			} else if(valorA == valorB) {
				vetorC[i] = 0;
			} else if(valorA < valorB) {
				vetorC[i] = -1;
			}
			
		}//fim for
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}
