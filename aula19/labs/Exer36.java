package com.keven.Aula19.labs;

/*
 * cada elemento do vetor A é formado pela potência de base 2 elevado ao expoente 
 * igual à posisão do elemento
 * ou seja A[i] = 2 ^ i
 */

public class Exer36 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[11];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.pow(2, i);
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

	}

}
