package com.keven.Aula19.labs;

/*
 * o valor do eelemento vetor B é o fatorial do elemento do vetor A
 */

public class Exer37 {

	public static void main(String[] args) {
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorB.length; i++) {
			
			int valor = 1;
			for(int j = vetorA[i]; j > 0; j--) {
				
				valor *= j;
				vetorB[i] = valor;
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
