package com.keven.cursojava.aula43.labs.exer01;

public class ContaBancaria {
	
	//Atributos
	private String nomeCliente;
	private String numCliente;
	private double saldo;
	
	//get and set 
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//métodos

	public void sacar(int quantidade) {
		if(this.saldo - quantidade < 0) {
			System.out.println("O saldo não pode ficar a negativo");
		} else {
			this.saldo -= quantidade;
		}
		
	}
	
	public void depositar(int quantidade) {
		this.saldo += quantidade;
	}
	
	//tostring
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numCliente=" + numCliente + ", saldo=" + saldo + "]";
	}
	
	
}
