package com.keven.cursojava.aula19.labs;

import java.util.Scanner;

/*
 * media dos números ímpares 
 */

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int valor = 0, media;
		int total = 0;
		int nImpares = 0;
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		System.out.print("Os números ímpares são ");
		for(int i=0; i < vetorA.length; i++) {
			valor = vetorA[i];
			if(valor % 2 == 0) {
				
			} else {
				nImpares += 1;
				total += valor;
				System.out.print(valor + " ");
			}
		}
		
		media = total/nImpares;		
		System.out.println("A média dos valores ímpares é " + media);

	}

}
