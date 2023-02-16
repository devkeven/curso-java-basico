package com.keven.cursojava.aula13.labs;

import java.util.Scanner;
import java.lang.Math. *;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		double raio, area;
		
		System.out.println("Insira o raio do círculo: ");
		raio = scan.nextDouble();
		
		//Funciona das duas maneiras
		//area = Math.PI * (raio * raio);
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círtculo é " + area);

	}

}
