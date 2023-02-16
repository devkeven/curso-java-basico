package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Montar tabuada de: ");
		int tabuada = scan.nextInt();
		
		System.out.print("Começar por: ");
		int comeco = scan.nextInt();
		
		System.out.print("Terminar em: ");
		int fim = scan.nextInt();
		
		System.out.print("Vou mostrar a tabuada de " + tabuada + " começando em " + comeco + " e termina em " + fim + ":");
		
		for(int i = comeco-1; i <= fim; ) {
			
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
			i++;
		}
		
	}

}
