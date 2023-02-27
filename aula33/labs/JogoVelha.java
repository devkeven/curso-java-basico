package com.keven.cursojava.aula33.labs;

public class JogoVelha {
	
	//Atributos
	
	private char[][] tabuleiro;
	private int jogada;
	
	//Construtores
	public JogoVelha() {
		tabuleiro = new char[3][3];
		jogada = 1;
	}
	
	public JogoVelha(char[][] tabuleiro, int jogada) {
		this.tabuleiro = tabuleiro;
		this.jogada = jogada;
	}

	//Métodos
	public void jogada(int linha, int coluna) {
		
		if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] =='O') {
			
			System.out.println("Impossível jogar nesta posição, tente outra!");
		} else {
						
			tabuleiro[linha][coluna] = verjogador();
			jogada++;
		}
		
	}//fim
	
	public void verTabuleiro() {
		
		for(int i=0; i<tabuleiro.length; i++) {
			for(int j=0; j<tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " | ");
			}
			
			System.out.println();
		}
		System.out.println();
	}
	
	char verjogador() {
		
		if(jogada % 2 == 0) {
			return 'O';
		} else {
			return 'X';
		}	
	}
	
	
	public boolean verVencedor() {
		
		boolean ganhou = false;
		String mensagem = "";
		
				
		if(tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X' ||//linhas
				tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X' ||
				tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X' ||
				
				tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X' ||//colunas
				tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X' ||
				tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X' ||
				
				tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X' ||//daigonal
				tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X') {
			
			mensagem = "O jogador X ganhou!";
			ganhou = true;
			
		}else if(tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O' ||//linhas
				tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O' ||
				tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O' ||
				
				tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O' ||//colunas
				tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O' ||
				tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O' ||
				
				tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O' ||//daigonal
				tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O'){
			
			mensagem = "O jogador O ganhou!";
			ganhou = true;
		} else if(getJogada() == 10) {
			mensagem = "Empate!";
			ganhou = true;					
		} 

		
		if(ganhou == true) {
			System.out.println(mensagem );
			
		}
		
		return ganhou;
	}//fim

	//getters and setters
	public char[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}

}
