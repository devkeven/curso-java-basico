package com.keven.cursojava.aula24.labs;

/*
 * Criar uma classe que representa os dados básicos de um livro
 */

public class Exer02 {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "Mastering ExtJ5";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		
		System.out.println("Nome do livro = " + livro.nome);

	}

}
