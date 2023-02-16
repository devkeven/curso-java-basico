package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o numero de turmas: ");
		int numTurmas = scan.nextInt();
		
		int nAlunos;
		int totalAlunos = 0;
		int mediaAlunos;
		
		for(int i=1; i <= numTurmas; i++) {
			System.out.println("Insira o número de alunos da " + i + "ª turma:");
			nAlunos = scan.nextInt();
			
			if(nAlunos > 40) {
				System.out.println("Uma turma não pode ter mais do que 40 alunos.");
				i--;
			} else {
				totalAlunos += nAlunos;
			}//fim if
			
		}//fim for
		
		mediaAlunos = totalAlunos / numTurmas;
		System.out.println("A media de alunos por turma é " + mediaAlunos);

		
	}

}
