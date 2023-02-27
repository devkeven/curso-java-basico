package com.keven.cursojava.aula33.labs;

public class ContaCorrente {
	
	//Atributos
	private String numero;
	private double saldo;
	private boolean status; //especial ou não
	private int limite;
	
	
	
	//constructors
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(String numero, double saldo, boolean status, int limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}

	//métodos
	public void realizarsaque(double qtd) {
		if(qtd > saldo) {
			System.out.println("Não tem saldo suficiente. Saldo: " + saldo);
		} else {
			saldo -= qtd;
			System.out.println("Saque realizado. Saldo: " + saldo);
		}
	}
	
	public void depositarDinheiro(double qtd) {
		if(saldo + qtd > limite) {
			System.out.println("Não pode depositar essa quantia pois ultrapassa o limite. Limite: " + limite + " Saldo: " + saldo);
		} else {
			saldo += qtd;
			System.out.println("Deposito realizado com sucesso. Saldo: " + saldo);
		}
	}
	
	public void consultarSaldo() {
		System.out.println("O saldo da conta é " + saldo);
	}
	
	public boolean vereficarEspecial() {
		return status;
	}
	
	private void alterarEspecial() {
		if(status) {
			status = false;
			System.out.println("Especial alterado para não.");
		} else {
			status = true;
			System.out.println("Especial alterado para sim.");
		}
	}

	
	//Getters end setters 
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	
	

}
