package com.keven.cursojava.aula19.labs;

import java.util.Scanner;

/*
 * percentagem pares e impares
 */

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int valor;
		int pares = 0;
		int impares = 0;
		double percPares = 0;
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.println("Insira o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i < vetorA.length; i++) {
			valor = vetorA[i];
			if(valor % 2 == 0) {
				pares += 1;
			} else {
				impares += 1;
			}
				
		}
		
		//System.out.println("pares " + pares);
		//System.out.println("impares " + impares);
		
		//percPares = (pares * (impares + pares) / 100);
		//System.out.println(percPares);
		
		System.out.println("Pares : " + ((pares * 100) / vetorA.length) + "%");
		System.out.println("Impares : " + ((impares * 100) / vetorA.length) + "%");
	}

}
