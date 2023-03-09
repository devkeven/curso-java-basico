package com.keven.cursojava.aula52.labs;

import java.util.Arrays;

public class Agenda {
	
	private Contacto[] contactos;
	
	
	public Agenda() {
		
		contactos = new Contacto[5];
	}
	
	public void adicionarContacto(Contacto c) throws AgendaCheiaException {
		
		//Contacto c = new Contacto();	
		//c.setNome(nome);
		//c.setTelefone(telefone);

		boolean cheia = true;
		for(int i=0; i < contactos.length; i++) {
			
			if(contactos[i] == null) {				
				contactos[i] = c;	
				cheia = false;
				break;
			}
						
		}
		if(cheia) {
			//lançar exception
			throw new AgendaCheiaException();
		}
	}//fim class

	public int consultarContactoPorNome(String nome) throws ContactoNaoExiste {
		
		for(int i=0; i< contactos.length; i++) {
			if(contactos[i] != null) {
				if(contactos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
			}
		}
		//lancar exception de contacto não existe
		throw new ContactoNaoExiste(nome);
		//return -1;	
	}

	
	@Override
	public String toString() {
		String s ="";
		for(Contacto c : contactos) {
			if(c != null) {
				s+= c.toString() + "\n";
			}			
		}
		return s;
	}


}
