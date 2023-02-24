package com.keven.cursojava.aula27.labs;

/*
 * Criar uma classe lampada e desenvolver metodos para ligar e desligar
 */

public class Exer01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		/*
		lampada.ligarLampada();			
		System.out.println(lampada.ligada);
		
		lampada.desligarLampada();
		System.out.println(lampada.ligada);
		*/
		
		lampada.ligarLampada();			
		lampada.mostrarEstado();
		
		lampada.desligarLampada();
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();
	}

}
