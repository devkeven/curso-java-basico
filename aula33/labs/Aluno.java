package com.keven.cursojava.aula33.labs;

public class Aluno {
	
		//Atributos
		private String nome;
		private String matricula;
		private String curso;
		private String[][] notasDisciplinas = new String[3][2];
		
		
		//construtor
		
		public Aluno() {
			
		}
		public Aluno(String nome, String matricula, String curso, String[][] notasDisciplinas) {			
			this.nome = nome;
			this.matricula = matricula;
			this.curso = curso;
			this.notasDisciplinas = notasDisciplinas;
		}

		
		//métodos
		public void vereficarAprovado(String disciplina) {
			int nota;
			boolean discEncontrada = false;
			for(int i=0; i<notasDisciplinas.length; i++) {
				
				if(notasDisciplinas[i][0].equals(disciplina)) {
					nota = Integer.parseInt(notasDisciplinas[i][1]);
					if(nota >= 7) {
						System.out.println("O aluno " +  nome + " está aprovado com a nota " + nota + ".");
						discEncontrada = true;
					} else {
						System.out.println("O aluno " +  nome + " está reprovado com a nota " + nota + ".");
						discEncontrada = true;
					}
				} 
			}
			
			if (!discEncontrada) {
				System.out.println("Disciplina não encontrada.");
			}
		}//fim
		
		public void verNotas() {
			int nota;
			
			for(int i=0; i<notasDisciplinas.length; i++) {
				for(int j=0; j<notasDisciplinas[i].length; j++) {
					System.out.print(notasDisciplinas[i][j] + " ");
				}
				System.out.println();
			}
		}//fim
		
		public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
			this.notasDisciplinas[pos][0] = nomeDisciplina;
		}
		
		public void setNotaDisciplinaPos(int pos, String nomeDisciplina) {
			this.notasDisciplinas[pos][1] = nomeDisciplina;
		}

		
		//getters and setters
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


		public String getCurso() {
			return curso;
		}


		public void setCurso(String curso) {
			this.curso = curso;
		}


		public String[][] getNotasDisciplinas() {
			return notasDisciplinas;
		}


		public void setNotasDisciplinas(String[][] notasDisciplinas) {
			this.notasDisciplinas = notasDisciplinas;
		}
		

}
