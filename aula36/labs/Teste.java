package com.keven.cursojava.aula36.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
      
		Curso curso = new Curso();		
		curso.setNome("Java");
		curso.setHorario("10:30 - 17:00");
        
        //professor
		Professor prof = new Professor();
		prof.setNome("Keven martins");
		prof.setEmail("Keven@email.com");
		prof.setDepartamento("Informática");
		
		if(curso != null) {
			curso.setProf(prof);
		}
        
        System.out.println("---Alunos---");
        
        Aluno[] alunos = new Aluno[5];
        for (int i=0; i<5; i++){
                      
            String nomeAluno = "Aluno" + (i+1);
            String matAluno = "" +(i+1);
            
            int[] notas = new int[4];
            
            for (int j=0; j<4; j++){
                System.out.println("Entre com a nota " + (j+1));
                notas[j] = scan.nextInt();
            }
            
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
        }
        
        curso.setAlunos(alunos);
        
        //System.out.println(curso.obterInfo());
        
        String mensagem;
		for(int i=0; i<alunos.length; i++) {
			mensagem = "O aluno " + alunos[i].getNome() + " obteve as notas " + alunos[i].obterNotas() + ", a média " + alunos[i].obterMedia() + " e está " + alunos[i].obterClassificacao(); 
			System.out.println(mensagem);
		}

	}

}
