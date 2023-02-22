package com.keven.Aula19.labs;

import java.util.Scanner;

/*
 * Inverter os elementos do vetor A e por no vetor B
 */

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		int valor;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Insira o valor do elemento " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[vetorA.length - 1 - i];
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
