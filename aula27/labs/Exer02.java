package com.keven.cursojava.aula27.labs;

/*
 * Criar uma classe que representa uma conta corrente
 */

public class Exer02 {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.consultarSaldo();
		//deposito
		conta1.depositarDinheiro(100);
		conta1.depositarDinheiro(100);
		
		//saque
		conta1.realizarsaque(20);
		
		//especial
		if(conta1.vereficarEspecial()) {
			System.out.println("O cliente está a usar cheque especial.");
		} else {
			System.out.println("O cliente não está a usar chaque especial.");
		}
		
		//depósito
		conta1.depositarDinheiro(1000);
		
		//saque
		conta1.realizarsaque(200);

	}

}
