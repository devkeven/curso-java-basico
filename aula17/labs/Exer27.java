package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

/*
 * Ler as temperaturas e dizer o maior, menor e media
 */

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int temperatura;	
		String continuar;
		boolean aux = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int total = 0;
		
		int count = 1;
		
		while(aux){
			System.out.println("Pretende inserir uma nova temperatura? (S/N)");
			continuar = scan.next();
			
			if(continuar.equalsIgnoreCase("s")) {
				System.out.println("Insira a temperatura: ");
				temperatura = scan.nextInt();
				total += temperatura;
				
				if(temperatura < min) {
					min = temperatura;
				} else if(temperatura > max) {
					max = temperatura;
				}
				
				count++;
				
			} else {
				aux = false;
				count--;
			}
						 			 
			
		}
		
		System.out.println("Nº temperaturas inseridas " + count);
		System.out.println("A temperatura máxima foi " + max);
		System.out.println("A temperatura mínima foi " + min);		
		System.out.println("A temperatura média foi " + total/count);

	}

}
