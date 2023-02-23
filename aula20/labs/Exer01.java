package com.keven.cursojava.aula20.labs;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[][] M = new int[4][4];
		
		int maior = Integer.MIN_VALUE;
		int maiorI = 0, maiorJ = 0;
		
		for(int i=0; i < M.length; i++) {
			for(int j=0; j < M[i].length; j++) {
				
				//System.out.println("i = " + i + " j = " + j);
				M[i][j] = rand.nextInt(10);
			}
		}
		
		
		for(int i=0; i < M.length; i++) {
			for(int j=0; j < M[i].length; j++) {
				
				System.out.print(M[i][j] + " ");
				
				if(M[i][j] > maior) {
					maior = M[i][j];
					maiorI = i;
					maiorJ = j;
				}
			}
			System.out.println();
			
		}
		
		System.out.println("O maior número é o " + maior + ", está na linha " + (maiorI + 1) + " e na coluna " + (maiorJ +1));
		
		

	}

}
