package com.keven.cursojava.aula19.labs;

import java.text.DecimalFormat;

/*
 * criar dois vetores com o mesmo tamanho 
 * os valores do vetor B é a raíz quadrada do vetor A
 * B = sqrt(A)
 */

public class Exer04 {

	public static void main(String[] args) {
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		double[] vetorB = new double[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++) {
			vetorB[i]= Math.sqrt(vetorA[i]);			
			
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("####.##");
		
		System.out.print("Vetor B = ");
		for(int i=0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}

	}

}
