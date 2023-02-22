package com.keven.cursojava.aula19.labs;

import java.util.Scanner;

/*
 * soma dos valores no vetor
 */

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int valor;
		int total = 0;
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		
		for(int i=0; i < vetorA.length; i++) {
			valor = vetorA[i];
			total += valor;
		}
		System.out.print("A soma dos números do vetor é: " + total);
		

	}

}
