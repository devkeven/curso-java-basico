package com.keven.cursojava.aula27.labs;

/*
 * Jogo da velha com classes
 */

public class Aluno {
	
	//Atributos
	String nome;
	String matricula;
	String curso;
	String[][] notasDisciplinas = new String[3][2];
	
	//métodos
	void vereficarAprovado(String disciplina) {
		int nota;
		boolean discEncontrada = false;
		for(int i=0; i<notasDisciplinas.length; i++) {
			
			if(notasDisciplinas[i][0].equals(disciplina)) {
				nota = Integer.parseInt(notasDisciplinas[i][1]);
				if(nota >= 7) {
					System.out.println("O aluno " +  nome + " está aprovado com a nota " + nota + ".");
					discEncontrada = true;
				} else {
					System.out.println("O aluno " +  nome + " está reprovado com a nota " + nota + ".");
					discEncontrada = true;
				}
			} 
		}
		
		if (!discEncontrada) {
			System.out.println("Disciplina não encontrada.");
		}
	}//fim
	
	void verNotas() {
		int nota;
		
		for(int i=0; i<notasDisciplinas.length; i++) {
			for(int j=0; j<notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}//fim

}
