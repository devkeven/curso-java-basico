package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira a quantidade (kg) de morango: ");
		double qtdMorango = scan.nextDouble();
		
		System.out.print("Insira a quantidade (kg) de maça: ");
		double qtdMaca = scan.nextDouble();
		
		double precoKgMorango =0;	
		
		if(qtdMorango <= 5) {			
			precoKgMorango = 2.5;
		}else {
			precoKgMorango = 2.2;
		}
		
		
		double precoKgMaca =0;
		
		if(qtdMorango <= 5) {			
			precoKgMaca = 1.8;
		}else {
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = qtdMorango * precoKgMorango;
		double precoTotalMaca = qtdMaca * precoKgMaca;
		
		double precoParcial = precoTotalMaca + precoTotalMorango;
		double precoTotal = precoParcial;
		
		if((qtdMorango + qtdMaca > 8) || precoParcial > 25) {
			double desconto = (precoParcial / 100) * 10; // 10 %
			precoTotal = precoParcial - desconto;
		}
		
		System.out.println("Preço  total = " + precoTotal);

	}

}
