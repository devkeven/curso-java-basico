package com.keven.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contacto contacto = new Contacto();
		contacto.setNome("Keven");
		//contacto.setEndereco("Kings Land");
		//contacto.setTelefone("135 999999999");
		
		
		//Relacionamento tem um endereco
		Endereco end = new Endereco();
		end.setNomeRua("Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("999999");		
		contacto.setEndereco(end);
			
		
		//Relacionamento tem um telefone
		Telefone tel = new Telefone();	
		tel.setTipo("Telemóvel");
		tel.setDdd("135");
		tel.setNumero("999 999 999");
		//contacto.setTelefone(tel);
		
		Telefone tel2 = new Telefone();	
		tel2.setTipo("Casa");
		tel2.setDdd("135");
		tel2.setNumero("444 444 677");
		//contacto.setTelefone(tel);
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		contacto.setTelefones(telefones);
				
		//teste saida no console
		System.out.println(contacto.getNome());
		//System.out.println(contacto.getEndereco().getCidade());
		//System.out.println(contacto.getTelefone().getNumero());
		
		
		//para evitar erros
		//vereficar se as duas classes estão vazias
		if(contacto != null && contacto.getEndereco() != null) {
			System.out.println(contacto.getEndereco().getCidade());
		}
		
		/*
		if(contacto != null && contacto.getTelefone() != null) {
			System.out.println(contacto.getTelefone().getDdd() + " " + contacto.getTelefone().getNumero());
		}
		*/
		
		if(contacto != null && contacto.getTelefones() != null) {
			
			for(Telefone t : contacto.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
		
	}

}
