package com.keven.cursojava.aula19.labs;

/*
 * criar dois vetores com o mesmo tamanho 
 * os valores do vetor B é o valor de A multiplicado pela posição no array
 * B = A * i
 */

public class Exer05 {

	public static void main(String[] args) {
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i< vetorA.length; i++) {
			vetorB[i] = vetorA[i] * i;
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i< vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("Vetor B = ");
		for(int i=0; i< vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}
