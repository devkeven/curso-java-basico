package com.keven.Aula19.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor do elemento " + i);
			vetorA[i] = scan.nextInt();
		}
		
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Tabuada de: ");
			System.out.println(vetorA[i] + " X 1 = " + (vetorA[i] * 1));
			System.out.println(vetorA[i] + " X 2 = " + (vetorA[i] * 2));
			System.out.println(vetorA[i] + " X 3 = " + (vetorA[i] * 3));
			System.out.println(vetorA[i] + " X 4 = " + (vetorA[i] * 4));
			System.out.println(vetorA[i] + " X 5 = " + (vetorA[i] * 5));
			System.out.println(vetorA[i] + " X 6 = " + (vetorA[i] * 6));
			System.out.println(vetorA[i] + " X 7 = " + (vetorA[i] * 7));
			System.out.println(vetorA[i] + " X 8 = " + (vetorA[i] * 8));
			System.out.println(vetorA[i] + " X 9 = " + (vetorA[i] * 9));
			System.out.println(vetorA[i] + " X 10 = " + (vetorA[i] * 10));
			System.out.println();
		}

	}

}
