package com.keven.cursojava.aula43.labs.exer02;

public class PessoaJuridica extends Contribuinte{
	
	private String nif;
	
	
	
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	
	
	public double calcularImposto() {
		
		return (this.getRendaBruta() * 10)/100;
		
	}
	
	
	@Override
	public String toString() {
		String s = "Pessoa Jurídica [";
		s = super.toString();
		s += " ;NIF " + this.getNif();
		s += " ;Imposto a ser pago " + this.calcularImposto();
		s += "]";
		return s;
	}

}
