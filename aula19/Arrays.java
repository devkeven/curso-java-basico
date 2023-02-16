package com.keven.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.7;
		double tempDia004 = 34;
		
		double[] temperaturas = new double[365];//valor inicial dos campos é 0
		
		//double temperatuas[];//má pratica
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33;
		temperaturas[3] = 20;
		temperaturas[4] = 18;
		
		System.out.println("O valor da temperatura do dia 1 é " + temperaturas[0]);
		System.out.println("O tamanho do array: " + temperaturas.length);
		System.out.println("Valores do array " + temperaturas);
		
		
		//for padrão
		for(int i=0; i < temperaturas.length; i++) {
			System.out.println("Temperaturas do dia " + (i+1) + " é " + temperaturas[i]);
		}
		
		
		//for melhorado versão 5 para frente
		for(double temp : temperaturas) {
			System.out.println(temp);
		}
		
		//as duas formas estão certo
				
	}

}
