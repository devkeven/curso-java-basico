package com.keven.cursojava.aula33.labs;

public class Lampada {
	
	//Atributos
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMes;
	private String[] tipos;
	private boolean ligada;
	
	
	//Construtores
	
	
	public Lampada() {
		ligada = true;
	}
	
	
	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMes,
			String[] tipos, boolean ligada) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMes = garantiaMes;
		this.tipos = tipos;
		this.ligada = ligada;
	}


	//Métodos
	public void ligar() {
		setLigada(true);
	}
	
	public void desligar() {
		setLigada(false);
	}
	
	public void mostrarEstado() {
		if(isLigada()) {
			System.out.println("A lâmpada esta ligada.");
		} else {
			System.out.println("A lâmpada esta desligada.");
		}
			
	}
	
	public void mudarEstado() {
		if(isLigada()) {
			desligar();
		}else {
			ligar();
		}
	}
	
	//getters e setters
	public boolean isLigada() {
		return this.ligada;
	}
	
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

}





