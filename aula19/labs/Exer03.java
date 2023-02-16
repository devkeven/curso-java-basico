package com.keven.cursojava.aula19.labs;

/*
 * criar dois vetores com o mesmo tamanho 
 * os valores do vetor B é o quadrado dos valores do vetor A
 * B = A * A
 */

public class Exer03 {

	public static void main(String[] args) {
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};;
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
