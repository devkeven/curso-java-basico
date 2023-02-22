package com.keven.Aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		//instância
		double [][] notasAlunos = new double[3][4];
		
		//jnserir valores
		notasAlunos[0][0]=10;
		notasAlunos[0][1]=7;
		notasAlunos[0][2]=9;
		notasAlunos[0][3]=9.5;
		
		notasAlunos[1][0]=9;
		notasAlunos[1][1]=8;
		notasAlunos[1][2]=7;
		notasAlunos[1][3]=9;
		
		notasAlunos[2][0]=8;
		notasAlunos[2][1]=9;
		notasAlunos[2][2]=10;
		notasAlunos[2][3]=7;
		
		//aceder e mostrar esses valores
		for(int i = 0; i < notasAlunos.length; i++) {
			//System.out.println(notasAlunos[i] + " ");
			for(int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		
		//mudar a quarta nota do segundo aluno de 9 para 8
		notasAlunos[1][3] = 8;
		
		System.out.println();
		
		for(int i = 0; i < notasAlunos.length; i++) {
			//System.out.println(notasAlunos[i] + " ");
			for(int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println("Calcular a média de cada aluno");
		
		double soma;
		
		for(int i = 0; i < notasAlunos.length; i++) {
			//System.out.println(notasAlunos[i] + " ");
			soma = 0;
			for(int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do aluno "+ i + " é = " + soma/4);
		}
		
		//inicializar vetores com valores
		double[] notasAluno1 = {7,8,9,10};
		
		//inicializar matrizes com valores
		double[][] notasAluns2 = {{7,8,9,10},{6,5,9,8}};
		
		
	}

}
