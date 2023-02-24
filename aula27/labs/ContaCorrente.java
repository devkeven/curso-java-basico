package com.keven.cursojava.aula27.labs;

public class ContaCorrente {
	
	String numero;
	double saldo;
	boolean status = true; //especial ou não
	int limite = 1000;
	
	
	//métodos
	void realizarsaque(double qtd) {
		if(qtd > saldo) {
			System.out.println("Não tem saldo suficiente. Saldo: " + saldo);
		} else {
			saldo -= qtd;
			System.out.println("Saque realizado. Saldo: " + saldo);
		}
	}
	
	void depositarDinheiro(double qtd) {
		if(saldo + qtd > limite) {
			System.out.println("Não pode depositar essa quantia pois ultrapassa o limite. Limite: " + limite + " Saldo: " + saldo);
		} else {
			saldo += qtd;
			System.out.println("Deposito realizado com sucesso. Saldo: " + saldo);
		}
	}
	
	void consultarSaldo() {
		System.out.println("O saldo da conta é " + saldo);
	}
	
	boolean vereficarEspecial() {
		return status;
	}
	
	void alterarEspecial() {
		if(status) {
			status = false;
			System.out.println("Especial alterado para não.");
		} else {
			status = true;
			System.out.println("Especial alterado para sim.");
		}
	}

}
