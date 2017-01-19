package aula8.colecoes;

import java.util.ArrayList;
import java.util.List;

import aula6.exemploHeranca.pessoa.Pessoa;

public class ExemploListaStrings {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Juquinha");
		nomes.add("Juquinha");
		nomes.add("Joao");
		nomes.add("Maria");
		
		//nomes.add(new Pessoa("teste"));
		
		for (String nome : nomes){
			//String nomeConvertido = (String) nome;
			System.out.println(nome);
		}
		
		nomes.remove("Juquinha");
		
		
		System.out.println("------");
		
		for (String nome : nomes){
			System.out.println(nome);
		}
		
		
	}
}
