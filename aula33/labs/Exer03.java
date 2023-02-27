package com.keven.cursojava.aula33.labs;

import java.util.Scanner;


public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
				
		System.out.println("Insira o nome do aluno: ");
		aluno1.setNome(scan.next());
		
		System.out.println("Insira a matrícula do aluno: ");
		aluno1.setMatricula(scan.next());
		
		System.out.println("Insira o nome curso do aluno: ");
		aluno1.setCurso(scan.next());
		
		for(int i=0; i < aluno1.getNotasDisciplinas().length; i++) {
			System.out.println("Insira o nome da " + (i+1) + "ª disciplina");
			aluno1.setNomeDisciplinaPos(i, scan.next());
			
			System.out.println("Insira a nota da disciplina: ");
			aluno1.setNotaDisciplinaPos(i, scan.next());
		}
			
		//ver notas
		aluno1.verNotas();
		
		boolean vereficarNotas = true;
		String disciplina;
		int menu;
		
		while(vereficarNotas) {
			
			System.out.println();
			System.out.println("1 - Consultar nota");
			System.out.println("0 - Sair");
			menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.println("Insira o nome da disciplina que pretende consultar: ");
				disciplina = scan.next();
				
				aluno1.vereficarAprovado(disciplina);
			} else {
				vereficarNotas = false;
			}
			
		}

	}

}
