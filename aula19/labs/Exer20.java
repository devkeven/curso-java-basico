package com.keven.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * converter a cotação do dolar de 1 a 20
 */

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[20]; 
		
		
		System.out.println("Insira a cotação: ");
		double cotacao = scan.nextDouble();
		
		for(int i=0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i +1);
		}
		
		
		DecimalFormat df = new DecimalFormat("###,####.##");
		
		for(int i=0; i < vetorA.length; i++) {
			System.out.print(df.format(vetorA[i]) + " ");
		}

	}

}
