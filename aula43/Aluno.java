package com.keven.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
	
	private String curso;
	private Double[] notas;
	
	
	public Aluno() {
		super();
	}
	
	
	public Aluno(String nome, String endereco, String telefone, String cpf, String telemovel) {
		//super(nome, endereco, telefone, cpf, telemovel);
		
		this.curso = curso;
		
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
	
	public void metodoQualquer() {
		//super.setCpf("23423");
		//this.setCpf("46345");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Enderecço do Aluno : ";
		//s += this.getEndereco();
		return s;
	}


	//@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
		
	}


	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		
		if(curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		} else {
			return false;
		}
		
	}
	
	/*
	public String toString() {
		String s = curso + "\n";
		for(double nota : notas) {
			s += nota + " ";
		}
		return s;
	}
	*/
	
	
	

}
