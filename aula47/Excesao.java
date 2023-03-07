package com.keven.cursojava.aula47;

public class Excesao {
	
	public static void main(String[] args) {
		
		try {
			
			int[] vetor  = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Este texto não vai ser impresso");
			
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Excessão ao acessar um indice do vetor que não existe.");
		}
		
		System.out.println("Este texto será impresso depois da exception");
		
	}

}
