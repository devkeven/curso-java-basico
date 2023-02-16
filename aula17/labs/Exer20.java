package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o numero de pessoas: ");
		int numPessoas = scan.nextInt();
		
		int total = 0;
		int idade;
		int media = 0;
		
		for(int i=1; i <= numPessoas; i++) {
			System.out.println("Insira a " + i + "ª idade:");
			idade = scan.nextInt();
			total += idade;
		}
		
		media = (total/numPessoas);
		if((media > 0) && (media<=25)) {
			System.out.println("Média de idades: " + media +". Turma Jovem.");
		} else if((media > 25) && (media<=60)) {
			System.out.println("Média de idades: " + media +". Turma Adulta.");
		} else if(media > 60) {
			System.out.println("Média de idades: " + media +". Turma Idosa.");
		}
		

	}

}
