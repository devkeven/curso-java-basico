package com.keven.cursojava.aula43.labs.exer01;

public class Teste {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		
		cp.setNomeCliente("Martins");
		cp.setNumCliente("1234");
		cp.setDiaRendimento("23");
		cp.setTaxaRendimento(3);
		
		System.out.println("Conta Poupança");
		cp.depositar(120);
		System.out.println("Saldo: " + cp.getSaldo());
		
		cp.sacar(20);
		System.out.println("Saldo depois do levantamento: " + cp.getSaldo());
		
		cp.calcularNovoSaldo();
		System.out.println("Saldo depois do pagamento: " + cp.getSaldo());
		
		System.out.println(cp);
		
		ContaEspecial ce = new ContaEspecial();
		
		ce.setNomeCliente("Keven");
		ce.setNumCliente("23423");
		ce.setLimite(0);
		
		System.out.println("Conta Especial");
		ce.depositar(200);
		System.out.println("Saldo: " + ce.getSaldo());
		
		ce.setLimite(100);
		System.out.println("Limite: " + ce.getLimite());
		
		ce.sacar(280);
		System.out.println("Saldo: " + ce.getSaldo());
		System.out.println("Limite: " + ce.getLimite());
		
		System.out.println(ce);

	}

}
