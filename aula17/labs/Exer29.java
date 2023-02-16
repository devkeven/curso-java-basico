package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int numero = scan.nextInt();
		
		boolean primo;
		
		for(int j=1; j < numero; j++) {
			
			primo = true;
			
			for(int i = 2; i < j; i++) {
				if(j % i == 0) {
					//System.out.println("Não é primo - divisivel por " + i);
					primo = false;
				} 
							
			}
			
			if(primo) {
				System.out.println("É primo." + j);
			} 
			
		}
		
		
		//Ainda não ta feito

	}

}
