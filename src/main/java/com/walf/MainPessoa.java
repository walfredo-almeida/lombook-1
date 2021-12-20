package com.walf;

public class MainPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("walfredo","almeida");
		Pessoa pessoaa = new Pessoa();
		
		System.out.println(pessoa.toString());
		
		pessoa.setNome("aleff");
		pessoa.setSobrenome("pereira");
		
		System.out.println(pessoa.toString());
		
		;
		

	}

}
