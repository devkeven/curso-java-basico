package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número");
		int num1 = scan.nextInt();
		
		System.out.print("Insira o segundo número");
		int num2 = scan.nextInt();
		
		while(num1 <= num2) {
			System.out.println(num1);
			num1 += 1;			
		}

	}

}
