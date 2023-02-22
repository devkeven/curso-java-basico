package com.keven.cursojava.aula19.labs;

import java.util.Scanner;

/*
 * soma < 15
 * quantidade = 15
 * media > 15
 */

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		int somaInferior = 0;
		int contIgual = 0;
		int contSuperior = 0;
		int somaSuperior = 0;
		double media = 0;
		
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i < vetorA.length; i++) {
			
			if(vetorA[i] < 15) {
				somaInferior += vetorA[i];
			} else if(vetorA[i] == 15) {
				contIgual++;
			} else if(vetorA[i] > 15) {
				contSuperior++;
				somaSuperior += vetorA[i];
			}
		}
		media = somaSuperior / contSuperior;
		
		System.out.println("Soma dos valores inferior a 15: " + somaInferior);
		System.out.println("Quantidade de elementos igual a 15: " + contIgual);
		System.out.println("Média dos elementos superior a 15: " + media);
	}

}
