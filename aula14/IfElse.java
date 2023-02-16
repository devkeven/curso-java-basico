package com.keven.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("Insira a sua idade: ");
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			
			System.out.print("É maior de idade.");
			
		}else {
			
			System.out.print("Não é maior de idade.");
		}
		
		*/
		
		
		//barato <=10
		//10 < valor < 15 - pedir desconto
		//15 <= 17 - pesquisar mais
		//>= 17 - muito caro
		
		System.out.print("Insira o valor do item: ");
		double valor = scan.nextDouble();
		
		if(valor <= 10) {
			System.out.print("Esta barato, pode comprar.");
		} else if(valor > 10 && valor < 15) {
			System.out.print("Peça um desconto.");			
		}else if(valor >=15 && valor < 17) {
			System.out.print("Pode pesquisar mais.");			
		}else {//valor >=17			
			System.out.print("Muito caro.");
		}

	}

}
