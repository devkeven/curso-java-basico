package com.keven.Aula19.labs;

import java.util.Scanner;

/*
 * vereficar se os numeros do array são primos ou não
 */

public class Exer33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira o valor do elemento " + i);
			vetorA[i] = scan.nextInt();
		}
		
		boolean primo;

		for(int i = 0; i < vetorA.length; i++) {
			
			primo = true;
			for(int j = 2; j < vetorA[i]; j++) {
				if(vetorA[i] % j  == 0) {
					primo = false;
					break;
				}
			}//fim j
			
			if(primo) {
				System.out.println(vetorA[i] + " é primo");
			} else {
				System.out.println(vetorA[i] + " não é primo");
			}
			
			
		}
		

	}

}
