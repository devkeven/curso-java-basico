package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		double popA, popB;
		double taxaA, taxaB;
		
		
		boolean valido = false;
		do {
			
			System.out.print("Insira a população A:");
			popA = scan.nextDouble();
			if(popA > 0) {
				valido = true;
			} else {
				System.out.println("População A precisa ser maior que 0.");
			}
						
		} while(!valido);
		
		
		//reiniciar variavel
		valido = false;
		do {
			
			System.out.print("Insira a população B:");
			popB = scan.nextDouble();
			if(popA > 0) {
				valido = true;
			} else {
				System.out.println("População B precisa ser maior que 0.");
			}
						
		} while(!valido);
		
		
		valido = false;
		do {
			
			System.out.print("Insira a taxa de crescimento da população A:");
			taxaA = scan.nextDouble();
			if(popA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento A precisa ser maior que 0.");
			}
						
		} while(!valido);
		
		
		valido = false;
		do {
			
			System.out.print("Insira a taxa de crescimento da população B:");
			taxaB = scan.nextDouble();
			if(popB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento B precisa ser maior que 0.");
			}
						
		} while(!valido);
		

		int count = 0;
		
		while(popA < popB) {
			
			popA += (popA/100) * taxaA;
			popB += (popB/100) * taxaB;
			count++;
		}
		
		System.out.println("Vai demorar " + count + " anos para população a ter os mesmos ou mais habitantes.");


	}

}
