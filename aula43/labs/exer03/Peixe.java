package com.keven.cursojava.aula43.labs.exer03;

public class Peixe extends Animal{
	
	private String caracteristicas;

	
	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzento");
		this.setCaracteristicas("Barbatanas e cauda");
	}

	//get set
	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	//toString
	@Override
	public String toString() {
		String s = super.toString();
		s += "Caracteristicas: " + caracteristicas; 
		return s;
	}
	
	
	
	
	

}
