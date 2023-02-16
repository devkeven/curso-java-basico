package com.keven.cursojava.aula17.labs;

import java.text.DecimalFormat;

public class Exer31 {

	public static void main(String[] args) {

		double salarioInic = 1000;
		int anoInic = 1995;
		double percentagem = 1.5;
		double salarioFim = salarioInic;
		
		salarioFim += (salarioFim / 100) * percentagem;//96
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for(int i = 1997; i < 2023; i++) {
			
			percentagem *= 2;
			salarioFim += (salarioFim / 100) * percentagem;
			
			System.out.println(i + " = " + format.format(salarioFim) + " - " + percentagem + "%");
		}
		
		
	}

}
