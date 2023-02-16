package com.keven.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//só imprime o primeiro multiplo de 7 e sai do ciclo
		//por causa do break
		/*
		System.out.print("Insira o número: ");
		int num = scan.nextInt();
		
		System.out.print("Insira o limite: ");
		int max = scan.nextInt();
		
		for(int i=num; i < max; i++) {
			System.out.println(i);
			if(i % 7 == 0) {
				System.out.print("O valor de i é " + i);
				break;//sai do ciclo quando encontra o numero
			}
		}
		*/		
		
		// não é utilizado rolulos
		/*
		for(int i=0; i <= 4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if(i==1) {
							break rotulo1;
						}
						if(i==2) {
							break rotulo2;
						}
						if(i==3) {
							break rotulo3;
						}
						System.out.println("Rotulo3");
					}
					System.out.println("Rotulo2");
				}
				System.out.println("Rotulo1");
			}
			System.out.println(i);
		}
		*/
		
		
		//quando encontra miltiplos de 7 não imprime
		//por causa do comtinue
		
		System.out.print("Insira o número: ");
		int num = scan.nextInt();
		
		System.out.print("Insira o limite: ");
		int max = scan.nextInt();
		
		for(int i=num; i < max; i++) {
			
			if(i % 7 == 0) {
				
				continue;
			}			
			System.out.println("O valor de i é " + i);
		}

	}

}
