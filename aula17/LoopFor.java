package com.keven.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		//for incremento
		for(int i=0; i < 5; i++) {
			System.out.println("Valor de i: " + i);			
		}
		
		//for decremento
		for(int i=5; i >= 0; i--) {
			System.out.println("Valor de i: " + i);			
		}
		
		//ciclo for com duas variáveis
		for(int i=0, j=10 ; i < j ; i++, j--) {
			System.out.println("i é:" + i + " j é: " + j);			
		}
		
		//for com partes ausentes
		int count = 0;
		for( ;count < 10; ) {
			System.out.println("Valor de count: " + count);	
			count += 2;
		}
		
		//mesco ciclo de maneira diferente
		for(int cont=0; cont < 10; cont += 2) {
			System.out.println("Valor de cont: " + cont);				
		}
		
		//loop sem corpo
		int soma = 0;
		for(int i = 1; i < 5; soma += i++);
		System.out.println("Valor da soma é: " + soma);	
		
		
		//também funciona sem a chavetas, quando tem apenas uma linha para executar		
		//Não é boa prática
		for(int i=0; i < 5; i++) 
			System.out.println("Valor de i: " + i);			
		
		
	}
	
	

}
