package com.keven.cursojava.aula36.labs;

public class Aluno {
	
	private String nome;
	private String matricula;
	private int[] notas;
	
	
	public Aluno(){
		
		//notas = new int[4];
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	public String obterNotas() {
		return notas[0] + " " + notas[1] + " " + notas[2] + " " + notas[3];
	}
	public double obterMedia() {
		double media = 0;
		for(int i=0; i<notas.length; i++) {
			media += notas[i];
		}
		media = media/notas.length;
		return media;
	}
	public String obterClassificacao() {
		String mensagem = "";
		if(obterMedia() >= 7){
			mensagem = "aprovado";
		}else {
			mensagem = "reprovado";
		}
		return mensagem;
	}
	

}
