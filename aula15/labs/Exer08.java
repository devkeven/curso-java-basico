package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double preco1,preco2,preco3;
		String produto1,produto2,produto3;
		
		System.out.print("Insira o nome do primeiro produto: ");
		produto1 = scan.next();
		System.out.print("Insira o preço do primeiro produto: ");
		preco1 = scan.nextDouble();
		
		System.out.print("Insira o nome do segundo produto: ");
		produto2 = scan.next();
		System.out.print("Insira o preço do segundo produto: ");
		preco2 = scan.nextDouble();
		
		System.out.print("Insira o nome do terceiro produto: ");
		produto3 = scan.next();
		System.out.print("Insira o preço do terceiro produto: ");
		preco3 = scan.nextDouble();

		if(preco1 < preco2 && preco1 < preco3) {
			System.out.println("Deverá escolher o produto " + produto1);
		} else if(preco2 < preco1 && preco2 < preco3){
			System.out.println("Deverá escolher o produto " + produto2);
		} else if(preco3 < preco1 && preco3 < preco2){
			System.out.println("Deverá escolher o produto " + produto3);
		}
		
	}

}
