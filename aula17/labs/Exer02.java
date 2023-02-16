package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o nome do utilizador: ");
		String nome = scan.next();
		
		System.out.print("Insira a senha do utilizador: ");
		String senha = scan.next();
		
		while(nome.equals(senha)) {
			System.out.println("O nome o utilizador não pode ser igual a senha de acesso.");
			
			System.out.print("Insira o nome do utilizador: ");
			nome = scan.next();
			
			System.out.print("Insira a senha do utilizador: ");
			senha = scan.next();
		}
		
		System.out.println("Utilizador: " + nome);
		System.out.println("Senha: " + senha);

	}

}
