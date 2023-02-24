package com.keven.cursojava.aula27.labs;

import java.util.Scanner;

/*
 * Criar uma classe que representa um aluno e ver as notas de tres disciplinas
 */

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
				
		System.out.println("Insira o nome do aluno: ");
		aluno1.nome = scan.next();
		
		System.out.println("Insira a matrícula do aluno: ");
		aluno1.matricula = scan.next();
		
		System.out.println("Insira o nome curso do aluno: ");
		aluno1.curso = scan.next();
		
		for(int i=0; i < aluno1.notasDisciplinas.length; i++) {
			System.out.println("Insira o nome da " + (i+1) + "ª disciplina");
			aluno1.notasDisciplinas[i][0] = scan.next();
			
			System.out.println("Insira a nota da disciplina: ");
			aluno1.notasDisciplinas[i][1] = scan.next();
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
