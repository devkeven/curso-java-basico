package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int s = 0, n = 0;
		String resposta;
		
		System.out.println("Responda com s ou n");
		
		System.out.print("Telefonou para a vitima?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			s++;
		}
		
		System.out.print("Esteve no local do crime?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			s++;
		}
		System.out.print("Mora perto da vitima?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			s++;
		}
		System.out.print("Devia para a vitima?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			s++;
		}
		System.out.print("Já trabalhou com a vitima?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			s++;
		}
		
		if(s == 2) {
			System.out.print("Suspeita");
		} else if(s>2 && s<5) {
			System.out.print("Cúmplice");
		} else if(s == 5) {
			System.out.print("Assassino");
		} else {
			System.out.print("Inocente");
		}
		

	}

}
