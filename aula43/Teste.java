package com.keven.cursojava.aula43;


public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Cências da computação");
		Double[] notas = {10.0, 9.0, 8.0, 7.0};
		aluno.setNotas(notas);
		
		System.out.println(aluno);//chama o método toString sem escrever .toString depois do aluno
		
		String s1 = "jnfndfn";
		String s2 = "jnfndfn";
		
		System.out.println(s1.equals(s2));
		
		
		Aluno aluno2  = new Aluno();	
		aluno2.setCurso("Cências da computação");
		Double[] notas2 = {3.0, 9.0, 4.0, 5.0};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
		
		
	}
	
	
}
