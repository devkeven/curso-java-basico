package com.keven.cursojava.aula45;

public class Teste {
	
		
	public static void main(String[] args) {
		
		/*
		Aluno aluno = new Aluno();
		
		Pessoa pessoaAluno = aluno; //upcasting	
		Pessoa aluno2 = (Pessoa) new Aluno();//upcasting
		
		Pessoa pessoa2 = new Pessoa();
		Aluno aluno4 = (Aluno) pessoa2;
		*/
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		if(pessoa instanceof Pessoa) {
			
		}
		if(aluno instanceof Aluno) {
			
		}
		if(professor instanceof Professor) {
	
		}

	}

}
