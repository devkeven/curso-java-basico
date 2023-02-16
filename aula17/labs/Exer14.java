package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int pares = 0;
		int impares = 0;
		int soma = 0;
		
		for(int i=1; i <= 10; i++) {
			
			System.out.println("Insira o " + i + "º número:");
			num = scan.nextInt();		
			soma += num;
			
			if(num % 2 ==0) {
				pares += 1;
			} else {
				impares += 1;
			}
			
		}
		
		System.out.println("Números pares : " + pares);
		System.out.println("Números impares : " + impares);
		System.out.println("Soma dos números : " + soma);
		

	}

}
