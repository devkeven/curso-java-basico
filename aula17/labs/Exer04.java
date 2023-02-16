package com.keven.cursojava.aula17.labs;

public class Exer04 {

	public static void main(String[] args) {
		
		double populacaoA = 80000, populacaoB = 200000;
		
		int i;				
		for(i =0; populacaoA <= populacaoB;i++ ) {
			
			populacaoA = (populacaoA * 1.03);
			populacaoB = (populacaoB * 1.015);
			
			System.out.println(populacaoA);
			System.out.println(populacaoB);
		}
		
		System.out.println("Vai demorar " + i + " anos para população a ter os mesmos ou mais habitantes.");

	}
	
	
	

}
