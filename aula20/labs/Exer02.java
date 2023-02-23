package com.keven.cursojava.aula20.labs;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[][] matrizM = new int[10][10];
		
		int valor;
		int maiorLinha5 = Integer.MIN_VALUE;
		int menorLinha5 = Integer.MAX_VALUE;
		
		int maiorColuna7 = Integer.MIN_VALUE;
		int menorColuna7 = Integer.MAX_VALUE;
		
		
		for(int i=0; i < matrizM.length; i++) {
			for(int j=0; j < matrizM[i].length; j++) {
				matrizM[i][j] = rand.nextInt(10);
			}
		}
		
		for(int i=0; i < matrizM.length; i++) {
			for(int j=0; j < matrizM[i].length; j++) {
				
				System.out.print(matrizM[i][j] + " ");
				
				valor = matrizM[i][j];
				
				//maior e menor linha 5
				if(i == 5 && valor > maiorLinha5) {
					maiorLinha5 = valor;
				}
				if(i == 5 && valor < menorLinha5) {
					menorLinha5 = valor;
				}
				
				//maior e menor coluna 7
				if(j == 7 && valor > maiorColuna7) {
					maiorColuna7 = valor;
				}
				if(j == 7 && valor < menorColuna7) {
					menorColuna7 = valor;
				}
				
			}
			System.out.println();
		}
		
		System.out.println("O maior numero na linha 5 é " + maiorLinha5 + " e o menor é " + menorLinha5);
		System.out.println("O maior numero na coluna 7 é " + maiorColuna7 + " e o menor é " + menorColuna7);

	}

}
