package com.keven.cursojava.aula17.labs;

public class Exer24 {

	public static void main(String[] args) {
		
		double preco = 0.18;
		
		System.out.println("Preço do pão R$ 0.18");
		System.out.println("Planificadora Pão de Ontem - Tabela de preços");
		
		for(int i=1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (preco * i));
		}

	}

}
