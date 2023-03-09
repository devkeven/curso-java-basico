package com.keven.cursojava.aula52.labs;

public class ContactoNaoExiste extends Exception{
	
	private String nomeContacto;

	public ContactoNaoExiste(String nomeContacto) {
		this.nomeContacto = nomeContacto;
	}
	
	@Override
	public String getMessage() {
		return "Contacto " + nomeContacto + " não existe na agenda!";
	}

}
