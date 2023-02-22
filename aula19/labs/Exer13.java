package com.keven.cursojava.aula19.labs;

import java.util.Scanner;

/*
 * soma dos valores no vetor que são múltiplos de 5
 */

public class Exer13 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int valor;
		int total = 0;
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		System.out.print("Números múltiplos de 5 do vetor: ");
		for(int i=0; i < vetorA.length; i++) {
			valor = vetorA[i];
			if(valor % 5 == 0) {
				total += valor;
				System.out.print(valor + " ");
			}
		}
		
		System.out.println("Total: "+ total);


	}

}
