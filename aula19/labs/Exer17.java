package com.keven.cursojava.aula19.labs;

import java.util.Scanner;

/*
 * quantidade de pessoas com idade superior a 35
 */

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[10]; 
		int numPessoas = 0;
		
		for(int i=0; i < vetor.length; i++) {
			System.out.println("Insira o valor do elemento " + i);
			vetor[i] = scan.nextInt();
		}
		
		for(int i=0; i < vetor.length; i++) {
			if(vetor[i] > 35) {
				numPessoas++;
			}
		}
		
		System.out.println(numPessoas + " pessoas posuem mais de 35 anos.");

	}

}
