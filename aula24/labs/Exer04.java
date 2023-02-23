package com.keven.cursojava.aula24.labs;

/*
 * Criar uma classe LivroDeBiblioteca com base na classe Livro
 */

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
				
		LivroDeBiblioteca livroBiblioteca = new LivroDeBiblioteca();
		
		livroBiblioteca.nome = "Mastering ExtJ5";
		livroBiblioteca.autor = "Loiane Groner";
		livroBiblioteca.anoLancamento = 2015;
		
		livroBiblioteca.emprestado = true;
		livroBiblioteca.dataEntrega = new Date();
		livroBiblioteca.emprestadoA = "Keven Martins";
		
		System.out.println("Nome do livro = " + livroBiblioteca.nome);

	}

}
