package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		int num;
		
		System.out.print("Insira um número: ");
		num = scan.nextInt();
		
		if(num < 0) {
			System.out.print("O número é negativo.");			
		} else if(num == 0) {
			System.out.print("O número 0 não é positivo nem negativo.");
		} else {
			System.out.print("O número é positivo.");
		}

	}

}
