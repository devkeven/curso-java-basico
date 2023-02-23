package com.keven.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		int opcao;
		int dia = 0, hora = 0;
		String compromisso = "";
		boolean diaValido;
		boolean horaValida;
				
		while(!sair) {
			System.out.println("1 - Inserir evento");
			System.out.println("2 - Ver evento");
			System.out.println("0 - Sair");
			opcao = scan1.nextInt();
			
			if(opcao == 1) {
				
				diaValido = false;
				while(!diaValido) {
					System.out.print("Insira o dia:");
					dia = scan.nextInt();
					if(dia > 0 && dia <=31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido, insira novamente: ");
					}		
				}
				
				horaValida = false;
				while(!horaValida) {
					System.out.print("Insira a hora do compromisso:");
					hora = scan.nextInt();
					if(hora >= 0 && hora <24) {
						horaValida = true;
					}else {
						System.out.println("Hora inválida, insira novamente: ");
					}		
				}
				
				dia--;
				System.out.println("Insira o compromisso:");
				compromissos[dia][hora] = scan.next();
								
			} else if(opcao ==2) {
				diaValido = false;
				while(!diaValido) {
					System.out.print("Insira o dia:");
					dia = scan.nextInt();
					if(dia > 0 && dia <=31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido, insira novamente: ");
					}		
				}
				
				horaValida = false;
				while(!horaValida) {
					System.out.print("Insira a hora do compromisso:");
					hora = scan.nextInt();
					if(hora >= 0 && hora <24) {
						horaValida = true;
					}else {
						System.out.println("Hora inválida, insira novamente: ");
					}		
				}
				dia--;
				System.out.println("O compromisso agendado é: " );
				System.out.println(compromissos[dia][hora]);
				
			} else if(opcao ==0) {
				sair = true;
			} else {
				System.out.println("Opcao inválida, insira novamente: ");
			}
			
			
		}
			
		
		

	}

}
