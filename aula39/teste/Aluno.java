package com.keven.cursojava.aula39.teste;

import com.keven.cursojava.aula39.Pessoa;

public class Aluno extends Pessoa{
	
	private String curso;
	private Double[] notas;
	
	
	public void vereficarAcesso() {
		
		super.nomeVisibilidade = "maria";		
		this.nomeVisibilidade = "ldfnf";
		
		this.setNomeVisibilidade("jksbkdf");
	}
	

	
	public Aluno() {
		super();
	}
	
	
	public Aluno(String nome, String endereco, String telefone, String cpf, String telemovel) {
		super(nome, endereco, telefone, cpf, telemovel);
		
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
		super.setCpf("23423");
		this.setCpf("46345");
	}

}
