package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o numero de CDs comprados: ");
		int numCDs = scan.nextInt();
		
		double valorCD;
		double valorTotal = 0;
		
		for(int i=1; i <= numCDs; i++) {
			System.out.print("Insira o valor do " + i + "º CD:");
			valorCD = scan.nextInt();
			valorTotal += valorCD;
									
		}//fim for
		
		double media = valorTotal/numCDs;		
		System.out.print("O preço médio gasto em cada CD é " + media);
		System.out.print("O total gasto é " + valorTotal);
		
	}

}
