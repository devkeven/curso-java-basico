package com.keven.cursojava.aula46.labs;

public class Cubo extends Figura3D {

	private double compAresta;
	
	public double getCompAresta() {
		return compAresta;
	}

	public void setCompAresta(double compAresta) {
		this.compAresta = compAresta;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(compAresta, 3);
	}

	@Override
	public double calcularArea() {
		return 6 * (compAresta * compAresta);
	}
	

}
