package com.keven.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		int numero1, numero2, soma;
		
		System.out.println("Insira o primeiro número: ");
		numero1 = scan.nextInt();
		
		System.out.println("Insira o segundo número: ");
		numero2 = scan.nextInt();
		
		soma = numero1 + numero2;
		System.out.println("A soma dos dois números é " + soma);

	}

}
