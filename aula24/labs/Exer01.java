package com.keven.cursojava.aula24.labs;

/*
 * Criar uma classe para representar uma lâmpada que está a venda num supermercado
 */

public class Exer01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMes = 36;
		lampada.potencia = 7;
		lampada.cor = "Branco";
		lampada.tipoLuz = "Amarelo";
		
		lampada.tipos = new String[5]; //sem iniciar a variável ocorre um erro
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Normal";
	}

}
