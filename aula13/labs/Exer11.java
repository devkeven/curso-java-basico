package com.keven.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1,num2;
		double num3;
		
		System.out.print("Insira o primeiro número: ");
		num1 = scan.nextInt();
		
		System.out.print("Insira o segundo número: ");
		num2 = scan.nextInt();
		
		System.out.print("Insira o terceiro número: ");
		num3 = scan.nextDouble();
		
		int dobroPrimeiro = num1 * 2 ;
		int metadeSegundo = num2 / 2;		
		int respostaA = dobroPrimeiro * metadeSegundo;
		
		int triploPrimeiro = num1 * 3 ;
		double respostaB = triploPrimeiro + num3;
		
		double respostaC = Math.pow(num3, 3);
		
		System.out.println("O produto do dobro do primeiro com  a metade do segundo é: " + respostaA);
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + respostaB);
		System.out.println("O terceiro elevado ao cubo é: " + respostaC);
		
	}

}
