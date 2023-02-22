package com.keven.cursojava.aula19.labs;

import java.util.Scanner;

/*
 * calcular media dos alunos e mostrar se está aprovado ou reprovado
 */

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[nota1.length];	
		double[] result = new double[nota1.length];
		
		double media;
		
		for(int i=0; i < nota1.length; i++) {
			System.out.print("Insira as duas notas de cada aluno: ");
			nota1[i] = scan.nextDouble();
			nota2[i] = scan.nextDouble();
		}
		
		for(int i=0; i < nota1.length; i++) {
			result[i] = ((nota1[i] + nota2[i])/2);
		}
		
		for(int i=0; i < nota1.length; i++) {
			media = result[i];
			if(media >= 7) {
				System.out.println("Aluno " + i + " nota 1: " + nota1[i] + " nota 2: " + nota2[i] + " média: " + result[i] + " Aprovado");	
			} else{
				System.out.println("Aluno " + i + " nota 1: " + nota1[i] + " nota 2: " + nota2[i] + " média: " + result[i] + " Reprovado");	
			}
			
		}

	}

}
