package com.keven.cursojava.aula19.labs;

import java.util.Scanner;

/*
 * mostrar a quantidade dos numeros pares do vetor
 */

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int valor;
		int quantidade = 0;
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		System.out.print("Números pares do vetor: ");
		for(int i=0; i < vetorA.length; i++) {
			valor = vetorA[i];
			if(valor % 2 == 0) {
				quantidade += 1;
				System.out.print(valor + " ");
			}			
		}
		System.out.println("Total de números pares do vetor: " + quantidade);

	}

}
