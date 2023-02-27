package com.keven.cursojava.aula33.labs;

import java.util.Scanner;


public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		JogoVelha jogo = new JogoVelha();
		
		boolean vencedor = false;
		int linha = 0;
		int coluna = 0;
		
		while(!vencedor) {
			
			System.out.println("Jogador "+ jogo.verjogador() +"!");
			
			//linha
			boolean linhaValida = false;
			while(!linhaValida) {
				System.out.println("Insira a linha (1,2 ou 3)");
				linha = scan.nextInt();
				if(linha >= 1 && linha <=3) {
					linhaValida = true;
				}else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			
			//coluna
			boolean colunaValida = false;
			while(!colunaValida) {
				System.out.println("Insira a coluna (1,2 ou 3)");
				coluna = scan.nextInt();
				if(coluna >= 1 && coluna <=3) {
					colunaValida = true;
				}else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			
			
			jogo.jogada(--linha,--coluna);			
			jogo.verTabuleiro();
			vencedor = jogo.verVencedor();
		}

	}

}
