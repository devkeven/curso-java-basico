package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Qual a tabuada que pretende ver? (1 a 10)");
		num = scan.nextInt();
		
		for(int i=1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		
		/*
		System.out.println(num + " X 1 = " + (num * 1));
		System.out.println(num + " X 2 = " + (num * 2));
		System.out.println(num + " X 3 = " + (num * 3));
		System.out.println(num + " X 4 = " + (num * 4));
		System.out.println(num + " X 5 = " + (num * 5));
		System.out.println(num + " X 6 = " + (num * 6));
		System.out.println(num + " X 7 = " + (num * 7));
		System.out.println(num + " X 8 = " + (num * 8));
		System.out.println(num + " X 9 = " + (num * 9));
		System.out.println(num + " X 10 = " + (num * 10));
		*/

	}

}
