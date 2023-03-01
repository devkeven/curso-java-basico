package com.keven.cursojava.aula36.labs;

/*
 * Relacionamento entre classes
 */

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		
		
		//agenda
		Agenda agenda = new Agenda();
		String nomeAgenda;
		System.out.println("Insira o nome da agenda: ");
		nomeAgenda = scan.next();
		agenda.setNome(nomeAgenda);
		
		//Contactos
		Contacto[] contactos = new Contacto[3];
			
		for(int i=0; i<contactos.length; i++) {
			
			Contacto c = new Contacto();
			
			System.out.println("Insira o nome do " + (i+1) +" contacto.");
			c.setNome(scan.next());
			
			System.out.println("Insira o telefone do " + (i+1) +" contacto.");
			c.setNome(scan.next());
			
			System.out.println("Insira o email do " + (i+1) +" contacto");
			c.setEmail(scan.next());
			
			contactos[i] = c;
		}
		
		agenda.setContactos(contactos);
		
		if(agenda != null) {
			System.out.print(agenda.obterInfo());
		}

	}

}
