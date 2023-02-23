package com.keven.cursojava.aula24.labs;

/*
 * Criar uma classe que representa um contacto
 */

public class Exer06 {

	public static void main(String[] args) {
		
		Contacto contacto1 = new Contacto();
		
		contacto1.nome = "Keven";
		contacto1.endereco = "Rua 17";
		contacto1.email = "keven@email.com"; 
		
		contacto1.telefones = new String[5];//iniciar o array 
		contacto1.telefones[0] ="999999999";
		contacto1.telefones[1] ="999999988";
		
	}

}
