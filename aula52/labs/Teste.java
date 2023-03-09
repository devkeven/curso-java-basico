package com.keven.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		
		while(opcao !=3) {
			
			opcao = obterOpcaoMenu(scan);
			
			if(opcao == 1) { //Consultar contacto				
				consultarContacto(scan, agenda);
			}
			else if(opcao == 2) {//Adicionar contacto				
				adicionarContacto(scan, agenda);			
			}		
		}
		
		
		
	}
	
	public static void adicionarContacto(Scanner scan, Agenda agenda) {
		System.out.println("Criando um contacto, insira as informações.");
		String nome = leInformacao(scan, "Insira o nome do contacto:");
		String telefone = leInformacao(scan, "Insira o telefone do contacto:");
		
		Contacto contacto = new Contacto();
		contacto.setNome(nome);
		contacto.setTelefone(telefone);
		
		System.out.println("Contacto a ser criado:");
		System.out.println(contacto);//contacto ou contacto.toString
		
		try {
			agenda.adicionarContacto(contacto);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());	
			//e.printStackTrace();
			
			System.out.println("Contactos da agenda:");
			System.out.println(agenda);
		}
	}
	
	public static void consultarContacto(Scanner scan, Agenda agenda) {
		
		String nomeContacto = leInformacao(scan, "Insira o nome do contacto a ser pesquisado:");
		
		try {
			if(agenda.consultarContactoPorNome(nomeContacto) >= 0) {
				System.out.println("Contacto existe");
				
			}
		} catch (ContactoNaoExiste e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
	
	public static String leInformacao(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}
	
	public static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 3;
		
		while(!entradaValida) {
			
			System.out.println("---Escolha uma opção---");
			System.out.println("1 - Consultar contacto");
			System.out.println("2 - Adicionar contacto");
			System.out.println("3 - Sair");
			
			try {
				//opcao = scan.nextInt();
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if(opcao == 1 || opcao == 2 || opcao == 3) {					
					entradaValida = true;
				}else {
					throw new Exception("Entrada inválida");
				}
			}catch(Exception ex) {
				System.out.println("Entrada inválida, digite novamente.\n");
			}
			
		}
				
		return opcao;
	}
	
}
