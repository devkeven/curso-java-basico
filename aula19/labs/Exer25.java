package com.keven.Aula19.labs;

import java.util.Scanner;

/*
 * se o valor de vetorA for par inserir 1 no vetorB e se foe impar inserir 0
 */

public class Exer25 {

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
			valor = vetorA[i];
			if(valor % 2 == 0) {
				vetorB[i] = 1;
			} else {
				vetorB[i] = 0;
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
