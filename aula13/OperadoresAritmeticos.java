package com.keven.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7; //resto da divisão
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma string concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado = resultado ++;
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++);//mostra depois concatena 
		System.out.println(++resultado);//primeiro concatena depois mostra 
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado --;
		System.out.println(resultado);
		
		
		System.out.println(resultado--);//mostra depois concatena 
		System.out.println(--resultado);//primeiro concatena depois mostra
		
	}

}
