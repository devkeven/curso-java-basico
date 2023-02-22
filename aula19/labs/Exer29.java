package com.keven.Aula19.labs;


/*
 * juntar os elementos de dois vetores num terceiro vetor
 */

public class Exer29 {

	public static void main(String[] args) {
		
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
		int[] vetorB = {11,12,13,14,15,16,17,18,19,20};
		int[] vetorC = new int[vetorA.length + vetorB.length];
		
		for(int i = 0; i < vetorC.length; i++) {
			if(i <= vetorA.length - 1) {
				vetorC[i] = vetorA[i];
			} else {
				vetorC[i] = vetorB[i - vetorA.length];
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
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
	}

}
