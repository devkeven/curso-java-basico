package com.keven.cursojava.aula19.labs;

/*
 * criar tres vetores com o mesmo tamanho 
 * os valores do vetor C é o resto da divisão por 2 dos valores dos vetores A e B
 * B = A % 2
 */

public class Exer10 {

	public static void main(String[] args) {
		
		int[] vetorA = {10,11,12,13,14,15,16,17,18,19};
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[i] % 2;
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i=0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		
	}

}
