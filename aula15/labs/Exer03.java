package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		
		System.out.print("Insira uma letra (F ou M): ");
		String input  = scan.next();
		
		if(input.equalsIgnoreCase("f")) {
			System.out.print("Feminino");			 
		} else if (input.equalsIgnoreCase("m")) {
			System.out.print("Masculino");			
		} else {
			System.out.print("Sexo inválido");
		}

	}

}
