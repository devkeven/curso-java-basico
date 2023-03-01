package com.keven.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		
		/*
		Aluno aluno = new Aluno();		
		Professor professor = new Professor();
		
		aluno.setNome("maria");
		aluno.setTelemovel("999 888 777");
		
		professor.setNome("Keven");
		*/
		
		//classe pessoa é uma superclasse
		//Ao instanciar assim não tenho acesso aos atributos especificos do aluno, mas sim os que tem em conjunto com a classe pessoa 
		Pessoa aluno = new Aluno();
		aluno.getNome();
		
		Pessoa professor = new Professor();
		professor.getNome();

	}

}
