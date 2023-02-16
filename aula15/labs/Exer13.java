package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		
		
		System.out.print("Insura um número de 1 a 7: ");
		numero = scan.nextInt();
		
		switch(numero){
		
			case 1: System.out.print("Domingo"); break; 
			case 2: System.out.print("Segunda"); break;
			case 3: System.out.print("Terça"); break;
			case 4: System.out.print("Quarta"); break;
			case 5: System.out.print("Quinta"); break;
			case 6: System.out.print("Sexta"); break;
			case 7: System.out.print("Sabado"); break;
			
			default: System.out.print("Número inválido!"); break;
			
		}
		

	}

}
