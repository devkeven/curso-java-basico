package com.keven.cursojava.aula43.labs.exer01;

public class ContaPoupanca extends ContaBancaria{
	
	//Atributos	
	private String diaRendimento;
	private int taxaRendimento;
	
	//get and set
	public String getDiaRendimento() {
		return diaRendimento;
	}
	public void setDiaRendimento(String diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	public int getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(int taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	//Métodos
	public void calcularNovoSaldo(){
		double saldo = getSaldo();
		saldo += (saldo * this.taxaRendimento)/ 100;
		setSaldo(saldo);
	}
	
	//toString
	@Override
	public String toString() {
		return super.toString() + "ContaPoupanca [diaRendimento=" + diaRendimento + ", taxaRendimento=" + taxaRendimento + "]";
	}
	
	
	
	
	

}
