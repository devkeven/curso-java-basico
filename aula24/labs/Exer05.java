package com.keven.cursojava.aula24.labs;

/*
 * Criar uma classe para representar uma conta bancária 
 * */

public class Exer05 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "123456";
		conta.nomeBanco = "123";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = 2000;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

	}

}
