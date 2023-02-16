package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, media;
		String conceito = "", mensagem = "";
		
		System.out.print("Insira a primeira nota: ");
		nota1 = scan.nextDouble();
		
		System.out.print("Insira a segunda nota: ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >=9 && media <=10) {
			
			 conceito = "A";
			 mensagem = "Aprovado";
			 
		} else if(media >= 7.5 && media < 9) {
			
			conceito = "B";
			mensagem = "Aprovado";
			
		} else if(media >= 6 && media < 7.5) {
			
			conceito = "C";
			mensagem = "Aprovado";
			
		}else if(media >= 4 && media < 6) {
			
			conceito = "D";
			mensagem = "Reprovado";
			
		}else if(media >= 0 && media < 4) {
			
			conceito = "E";
			mensagem = "Reprovado";
		}
		
		System.out.println("Notas: " + nota1 + " - " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito + " - " + mensagem);

	}

}
