package com.keven.Aula19.labs;

import java.util.Scanner;
/*
 * Criar vetor com 10 elementos e parar se um elemento não for par
 */

public class Exer23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira um número para a posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 != 0) {
				break;
			}
		}
		
		
		
	}

}
