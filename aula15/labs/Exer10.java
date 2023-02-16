package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String turno;
		
		System.out.println("M - Matutino ou V - Vespertino ou N-Noturno");
		System.out.println("Insira o turno que você estuda: ");
		
		turno = scan.next();
		
		if(turno.length() != 1) {		
			System.out.println("Turno inválido");
		} else if(turno.equalsIgnoreCase("m")){
			System.out.println("Bom dia!");	
		} else if(turno.equalsIgnoreCase("v")){
			System.out.println("Boa tarde!");
		} else if(turno.equalsIgnoreCase("n")){
			System.out.println("Boa noite!");
		}else {
			System.out.println("Inválido!");
		}

	}

}
