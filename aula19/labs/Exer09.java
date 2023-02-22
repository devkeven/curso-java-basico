package com.keven.cursojava.aula19.labs;

/*
 * criar tres vetores com o mesmo tamanho 
 * os valores do vetor C é a divisão dos valores dos vetores A e B
 * C = A / B
 */

import java.text.DecimalFormat;

public class Exer09 {

	public static void main(String[] args) {
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
		int[] vetorB = {1,2,1,2,2,3,6,2,1,2};
		double[] vetorC = new double[vetorA.length];
		
		for(int i=0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
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
		System.out.println();
		
		
		DecimalFormat df = new DecimalFormat("###,####.##");
		
		System.out.print("Vetor C = ");
		for(int i=0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}
