package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean  naoTerminar = true;
		int cod, qtd;
		double total = 0;
		String output = "";
		
		do {
			
			System.out.print("Insira o código e a quantidade. Insira 0 0 para sair.");
			cod = scan.nextInt();
			qtd = scan.nextInt();
			
			
			if(cod == 0 && qtd == 0) {
				naoTerminar = false;
				output += "Total a pagar = " + total;
			} else {
				
				if(cod == 100) {
					output += "Cachorro Quente -> 1,20 * " + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if(cod == 101) {
					output += "Bauro Simples -> 1,30 * " + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if(cod == 102) {
					output += "Bauro com ovo -> 1,50 * " + qtd;
					output += " = " + (1.5 * qtd) + "\n";
					total += 1.5 * qtd;
				} else if(cod == 103) {
					output += "Hambúrger -> 1,20 * " + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if(cod == 104) {
					output += "Cheeseburger -> 1,30 * " + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if(cod == 105) {
					output += "Refrigerantes -> 1,00 * " + qtd;
					output += " = " + (1.0 * qtd) + "\n";
					total += 1.0 * qtd;
				}
			}
			
			
		}while(naoTerminar);
		
		System.out.println(output);

	}

}