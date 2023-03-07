package com.keven.cursojava.aula46.labs;

public class Quadrado extends Figura2D {

	private double compLado;
	
	
	public double getCompLado() {
		return compLado;
	}


	public void setCompLado(double compLado) {
		this.compLado = compLado;
	}


	@Override
	public double calcularArea() {
		return compLado * compLado;
		
	}

}
