package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros ();
		
		System.out.println(gato);
		System.out.println(livros);
				
		// primeiro codigo em java
		/*int a = 2;
		int b = 10;
		System.out.println("Meu Primeiro codigo em Java, a soma das variaveis é = " + (a+b));*/
	}

}

class Livros {
	private String nome;
	private String npag;
}