package com.keven.cursojava.aula43.labs.exer02;

public class PessoaFisica extends Contribuinte{
	
	private String nif;
	
	

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		String s = "Pessoa Física [";
		s = super.toString();
		s += " ;NIF " + this.getNif();
		s += " ;Imposto a ser pago " + this.calcularImposto();
		s += "]";
		return s;
	}
	

	@Override
	public double calcularImposto() {
		
		double renda = this.getRendaBruta();
		
		if(renda <= 1400) {
			return 0;
		}
		
		if(renda > 1400 && renda <= 2100) {
			return renda * 0.1 - 100;
		}
		
		if(renda > 2100 && renda <= 2800) {
			return renda * 0.15 - 270;
		}
		
		if(renda > 2800 && renda <= 3600) {
			return renda * 0.25 - 500;
		}
		
		// maior que 3600
		return renda * 0.30 - 700;
		
		
	}
	
	
	

}
