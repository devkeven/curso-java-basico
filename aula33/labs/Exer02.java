package com.keven.cursojava.aula33.labs;


public class Exer02 {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		
		conta1.setNumero("123");
		conta1.setLimite(1000);
		conta1.setStatus(true);
		conta1.setSaldo(10);
		
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
