package com.keven.cursojava.aula27.labs;

public class Lampada {
	
	//Atributos
	String modelo;
	double tencao;
	int potencia;
	String cor;
	String tipoLuz;
	boolean ligada;
	
	
	//métodos	
	void ligarLampada() {
		ligada = true;
	}
	
	void desligarLampada() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("A lâmpada está ligada.");
		} else {
			System.out.println("A lâmpada está desligada.");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			desligarLampada();
		} else {
			ligarLampada();
		}
	}

}
