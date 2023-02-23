package com.keven.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] matrizM = new int[3][3];
		
		int nPares = 0;
		int nImpares = 0;
		
		for(int i=0; i < matrizM.length; i++) {
			for(int j=0; j < matrizM[i].length; j++) {
				
				System.out.println("Insira o numero do elemento " + i + ",  " + j);
				matrizM[i][j] = scan.nextInt();
						
			}
						
		}//fim for matriz
		
		
		//contar pares e impares 
		for(int i=0; i < matrizM.length; i++) {
			for(int j=0; j < matrizM[i].length; j++) {
				
				System.out.print(matrizM[i][j] + " ");
				
				if(matrizM[i][j] % 2 == 0) {
					nPares++;
				} else {
					nImpares++;
				}
									
			}
			
			System.out.println();
						
		}
		
		System.out.println("O número de pares é " + nPares);
		System.out.println("O número de ímpares é " + nImpares);
		

		
	}

}
