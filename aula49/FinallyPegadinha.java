package com.keven.cursojava.aula49;

public class FinallyPegadinha {

	
	public static void main(String[] args) {

		int[] numeros = {4,8,16,32,64,128};
		int[] denominador = {2,0,4,8,0};

		for(int i=0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i]/denominador[i]));
			}catch(ArithmeticException e){
				System.out.println("Erro ao dividir por zero.");
				System.exit(0);//termina o programa
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição do array inválida.");
				System.exit(0);
			}
			finally {
				System.out.println("Essa linha é sempre impressa após o try ou catch");
			}
		}

	}
	
}
