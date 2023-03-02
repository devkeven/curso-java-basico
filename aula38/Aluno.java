package com.keven.cursojava.aula38;

public class Aluno extends Pessoa{
	
	private String curso;
	private Double[] notas;
	
	
	public Aluno() {
		super();
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Double[] getNotas() {
		return notas;
	}
	public void setNotas(Double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	public boolean vereficarAprovado() {
		return true;
	}

}
