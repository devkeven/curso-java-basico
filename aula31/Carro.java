package com.keven.aula31;


//Default pode ser utilizado dentro do mesmo pacote
//public pode ser usado dentro de outros pacotes 
//private só pode ser usado dentro da mesma classett


public class Carro {
	
	//atributos
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	//Métodos
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km.");
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km * this.consumoCombustivel;
	}
	
	public double obterAutonomia() {		
		System.out.println("Método obterAutonomia foi chamado");
		return capCombustivel * this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		
		return this.divideKMPorConsumoCombustivel(km);
	}
	
			
}
