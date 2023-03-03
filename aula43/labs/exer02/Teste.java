package com.keven.cursojava.aula43.labs.exer02;

public class Teste {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();		
		p1.setNome("Contribuinte 01");
		p1.setNif("34534534");
		p1.setRendaBruta(1000);
			
		PessoaFisica p2 = new PessoaFisica();		
		p2.setNome("Contribuinte 02");
		p2.setNif("23423424");
		p2.setRendaBruta(1500);
		
		PessoaFisica p3 = new PessoaFisica();		
		p3.setNome("Contribuinte 03");
		p3.setNif("23444234");
		p3.setRendaBruta(2600);
		
		PessoaJuridica p4 = new PessoaJuridica();		
		p4.setNome("Contribuinte 04");
		p4.setNif("34543");
		p4.setRendaBruta(5000);
		
		PessoaJuridica p5 = new PessoaJuridica();		
		p5.setNome("Contribuinte 05");
		p5.setNif("34534");
		p5.setRendaBruta(10000);
		
		PessoaJuridica p6 = new PessoaJuridica();		
		p6.setNome("Contribuinte 06");
		p6.setNif("345354");
		p6.setRendaBruta(50000);
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for(Contribuinte c : contribuintes) {
			System.out.println(c);
		}

	}

}
