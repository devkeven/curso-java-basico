package com.keven.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double tamanhoArquivo, velocidadeInternet;
		
		System.out.print("Insira o tamanho do arquivo para download(em MB): ");
		tamanhoArquivo = scan.nextDouble();
		
		System.out.print("Insira a velocidade de um link de internet: ");
		velocidadeInternet = scan.nextDouble();
		
				
		double tempoAproximado = tamanhoArquivo / velocidadeInternet;
		System.out.println("Tempo de download é " + tempoAproximado);

	}

}
