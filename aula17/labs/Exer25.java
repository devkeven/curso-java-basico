package com.keven.cursojava.aula17.labs;

import java.util.Scanner;

/*
 * caixa automatica com vários produtos
 */

public class Exer25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Lojas Tabajara");
		
		String output;
		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		double valorPago, troco;
		
		do {
			
			System.out.println("Deseja Informart uma nova compra S/N");
			continuarCompra = scan.next();
			
			if(continuarCompra.equalsIgnoreCase("S")) {
				output = "Lojas Tabajara\n";
				
				System.out.println("Insira a quantidade de produtos da compra: ");
				qtdProdutos = scan.nextInt();
				
				total = 0;
				
				for(int i=1; i <= qtdProdutos; i++) {
					System.out.println("Informe o preço do produto " + i);
					preco = scan.nextDouble();
					
					total += preco;
					output += "Produto " + i + ": " + preco +"€\n";
				}
				
				output += "Total: " + total + "€"; 
				
				System.out.println("Total: " + total + "€");
				
				System.out.println("Insira o valor pago: ");
				valorPago = scan.nextDouble();
				
				output += "Dinheiro: " + valorPago + "€\n";
				
				troco = total - valorPago;
				
				output += "Troco: " + troco + "€";
				
				System.out.println(output);
				
				
			}else {
				sair = true;
			}
						
																	
		}while(!sair);
		

	}

}
