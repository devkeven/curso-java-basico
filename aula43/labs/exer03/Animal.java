package com.keven.cursojava.aula43.labs.exer03;

public abstract class Animal {
	
	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	
	
	public Animal() {
		this.setPatas(4);
	}
	//get set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	//toString
	@Override
	public String toString() {
		String s;
		s = "Animal: " + nome + "\n";
		s += "Comprimento: " + comprimento + " cm\n";
		s += "Patas: " + patas + "\n";
		s += "Cor: " + cor + "\n";
		s += "Ambiente: " + ambiente + "\n";
		s += "Velocidade: " + velocidade + " m/s\n";
		
		return s;
	}
	
	
	
	

}
