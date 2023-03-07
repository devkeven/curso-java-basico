package com.keven.cursojava.aula46.labs;

public class Triangulo extends Figura2D {

	double base, altura;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (base*altura)/2;
		
	}
	
	

}
