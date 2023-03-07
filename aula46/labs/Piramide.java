package com.keven.cursojava.aula46.labs;

public class Piramide extends Figura3D {

	private double altura;
	private double arestaBase;
	private double apotema;
	private double numPoliBase;
	
	
	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double ipotema) {
		this.apotema = ipotema;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setNumPoliBase(double numPoliBase) {
		this.numPoliBase = numPoliBase;
	}
	public double getNumPoliBase() {
		return numPoliBase;
	}

	@Override
	public double calcularVolume() {
		double areaBase = arestaBase * arestaBase;
		return (areaBase * altura) / 3;
	}

	@Override
	public double calcularArea() {
		double areaBase = arestaBase * arestaBase;		
		return numPoliBase * (arestaBase * apotema) / 2 + areaBase;
	} 
	

}
