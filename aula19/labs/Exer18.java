package com.keven.cursojava.aula19.labs;

import java.util.Scanner;

/*
 * O maior e o menor número e a posição no vetor
 */

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[10]; 
		int valor;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int posMaior = 0;
		int posMenor = 0;
		
		for(int i=0; i < vetor.length; i++) {
			System.out.println("Insira o valor do elemento " + i);
			vetor[i] = scan.nextInt();
		}
		
		for(int i=0; i < vetor.length; i++) {
			valor = vetor[i];
			if(valor < menor) {
				menor = valor;
				posMenor = i;
			}
			if(valor > maior) {
				maior = valor;
				posMaior = i;
			}
		}
		
		System.out.println("O maior número é o " + maior + " e está na posição " + posMaior );
		System.out.println("O menor número é o " + menor + " e está na posição " + posMenor );

	}

}
