package com.br.pessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instaciado classe pessoa
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa);
		
		// passado valores para atributos do objeto
		pessoa.nome = "Vinicius";
		pessoa.sobrenome = "Braz";
		pessoa.idade = "30";
		pessoa.cpf = "123.123.456-20";
		
		//impressao para validar valores.
		System.out.println(pessoa.nome);
		
		
		//Instaciado objeto 
		Endereco endVInicius = new Endereco();
		System.out.println(pessoa.endereco);
		
		
		pessoa.endereco = endVInicius;
		
		endVInicius.logradouro = "Maestro Carlos Frank";
		endVInicius.numero = "2461";
		endVInicius.complemento = "Bloco 03, ap 22";
		endVInicius.bairro = "Boqueirão";
		endVInicius.cidade = "Curitiba";
		endVInicius.cep = "81750-300";
		
		System.out.println(pessoa.endereco.logradouro);
		System.out.println(pessoa.endereco.numero);
		System.out.println(pessoa.endereco.complemento);
		System.out.println(pessoa.endereco.bairro);
		

	}

}
