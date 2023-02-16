package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Insira o prmeiro número: ");
		num1 = scan.nextInt();
		
		System.out.print("Insira o segundo número: ");
		num2 = scan.nextInt();
		
		if(num1 > num2 ) {			
			System.out.print("O primeiro número é maior.");
		} else if(num1 == num2 ) {			
				System.out.print("Os números são iguais.");
		} else {
			System.out.print("O segundo número é maior.");
		}
		
	}

}
