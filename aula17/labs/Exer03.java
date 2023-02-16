package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome,genero,estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.print("Insira o nome do utilizador: ");
			nome = scan.next();
			
			if(nome.length() > 3) {
				infoValida = true;
			} else {
				System.out.println("O nome precisa no minimo 3 caracteres.");
			}
		} while(!infoValida);
		
		//reset da variavel
		infoValida = false;
		
		do {
			System.out.print("Insira a idade: ");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("O nome precisa ser entre 0 e 150.");
			}
		} while(!infoValida);
		
		//reset da variavel
		infoValida = false;
		
		do {
			System.out.print("Insira o salario: ");
			salario = scan.nextDouble();
			
			if(salario > 0) {
				infoValida = true;
			} else {
				System.out.println("O salário precisa sem maior que 0.");
			}
		} while(!infoValida);
				
		//reset da variavel
		infoValida = false;
				
		do {
			System.out.print("Insira o genero (f ou m): ");
			genero = scan.next();
			
			if(genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f")) {
				infoValida = true;
			} else {
				System.out.println("O genero tem de ser 'f' ou 'm'.");
			}
		} while(!infoValida);
		
		
		//reset da variavel
		infoValida = false;
		
		do {
			System.out.print("Insira o estado civil 's', 'c', 'v', 'd': ");
			estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("s") ||
					estadoCivil.equalsIgnoreCase("c") ||
					estadoCivil.equalsIgnoreCase("v") || 
					estadoCivil.equalsIgnoreCase("d")) {
				
				infoValida = true;
			} else {
				System.out.println("O estado civil precisa ser 's', 'c', 'v', 'd'.");
			}
		} while(!infoValida);
		
		System.out.println("Informações introduzidas:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Genero: " + genero);
		System.out.println("Estado civil: " + estadoCivil);
		

	}

}
