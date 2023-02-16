package com.keven.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double lado,area,dobroArea;
		
		System.out.print("Insira o comprimento de um dos lados do quadrado: ");
		lado = scan.nextDouble();
		
		area = Math.pow(lado, 2);
		
		dobroArea = area * 2;
		
		System.out.print("A área é " + area + " e o dobro da área é " + dobroArea );
		

	}

}
