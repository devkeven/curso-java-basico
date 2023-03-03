package com.keven.cursojava.aula43.labs.exer01;

public class ContaEspecial extends ContaBancaria{
	
	//Atributos
	private double limite;

	//get and set
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//Métodos
	public void sacar(int quantidade) {
		double saldo = getSaldo();
		double saldoEspecial = saldo + limite;
		
		if(saldoEspecial - quantidade < 0) {
			System.out.println("O levantamento não pode ultrapassar o limite.");
		} else {
			
			if(saldo - quantidade >= 0) {
				saldo -= quantidade;
			} else {
				double resto = saldo - quantidade;
				limite += resto;
				setSaldo(0);
			}
		}
	}
	//toString
	@Override
	public String toString() {
		return super.toString() + "ContaEspecial [limite=" + limite + "]";
	}

}
