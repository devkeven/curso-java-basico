package com.keven.cursojava.aula43.labs.exer03;

public class Teste {
	
	public static void main(String[] args) {
		
		Mamifero m1 = new Mamifero();		
		m1.setNome("Camelo");
		m1.setComprimento(150);
		//patas 4
		m1.setCor("Amarelo");
		m1.setAmbiente("Terra");
		m1.setVelocidade(2.0);
		m1.setAlimento("Tâmaras");
		
		Mamifero m2 = new Mamifero();		
		m2.setNome("Urso-do-canadá");
		m2.setComprimento(180);
		//patas 4
		m2.setCor("Vermelho");
		m2.setAmbiente("Terra");
		m2.setVelocidade(0.5);
		m2.setAlimento("Mel");
		
		Peixe p1 = new Peixe();		
		p1.setNome("Tubarão");
		p1.setComprimento(300);
		//patas 4
		p1.setCor("Cinzento");
		p1.setAmbiente("Mar");
		p1.setVelocidade(1.5);
		//p1.setAlimento("Mel");
		
		
		/*
		System.out.println("Zoo:");
		System.out.println("-----------------------");
		System.out.println(m1);
		System.out.println("-----------------------");
		System.out.println(p1);
		System.out.println("-----------------------");
		System.out.println(m2);
		*/
		
		Animal[] animais = new Animal[3];
		
		animais[0] = m1;
		animais[1] = p1;
		animais[2] = m2;
		
		System.out.println("Zoo:");
		System.out.println("-----------------------");
		for(Animal a : animais) {			
			System.out.println(a);
			System.out.println("-----------------------");
		}
	}

}
