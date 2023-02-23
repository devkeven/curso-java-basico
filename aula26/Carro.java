package com.keven.cursojava.aula26;

public class Carro {
	
	//atributos
		String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consumoCombustivel;
		
		//métodos
		//o nome dos métodos começam sepmre com um verbo
		void exibirAutonomia() {
			System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km.");
		}
		
		double obterAutonomia() {
			
			System.out.println("Método obterAutonomia foi chamado");
			return capCombustivel * consumoCombustivel;
		}

}
