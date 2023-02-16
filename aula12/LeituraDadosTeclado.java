package com.keven.cursojava.aula12;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		
		/*
		//le a linha inteira
		System.out.println("Degita o teu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("O teu nome completo é: " +nomeCompleto);
		
		//lê a primeira palavra 
		System.out.println("Degita o teu primeiro nome : ");
		String primeiroNome = scan.next();
		System.out.println("O teu primeiro nome é: " +primeiroNome);
						
		System.out.println("Degita a tua idade : ");
		int idade = scan.nextInt();
		System.out.println("O tua idade é: " +idade);
		
		System.out.println("Degita a tua altura : ");
		double altura = scan.nextDouble();
		System.out.println("O tua altura é: " +altura);
		*/
		
		
		System.out.println("Insira o seu primeiro nome, idade, quantidade de filhos, altura e bichos de estimação:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean(); 
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro nome:" + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Bicho de estimação:" + temPet);
		
		

	}

}
