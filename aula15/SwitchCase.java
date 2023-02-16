package com.keven.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um dia da semana (1-7)");
		int diaSemana = scan.nextInt();
		
		/*
		if(diaSemana == 1) {			
			System.out.println("Domingo");
		} else if(diaSemana == 2 ) {
			System.out.println("Segunda");			
		} else if(diaSemana == 3 ) {
			System.out.println("Terça");			
		} else if(diaSemana == 4 ) {
			System.out.println("Quarta");			
		} else if(diaSemana == 5 ) {
			System.out.println("Quinta");			
		} else if(diaSemana == 6 ) {
			System.out.println("Sexta");			
		} else if(diaSemana == 7 ) {
			System.out.println("Sabado");			
		} else {
			System.out.println("Não é um dia da semana válido!");
		}
		*/
		
		//no fi sempre utilizamos expreções logicos
		
		switch(diaSemana) {		
		case 2: 
		case 3:
		case 4:
		case 5:
		case 6: System.out.println("Dia útil"); break;
		case 1:
		case 7: System.out.println("Fim de semana"); break;
		default:System.out.println("Não é um dia da semana válido!");
		}
		
		//break serve para ignorar as outras linhas se for verdadeiro
		
		//caso queiras que só uma linha seja executada tens de usar o breake 
		//senão ele executa todas as linhas depois de encontrar o verdadeiro
	}

}
