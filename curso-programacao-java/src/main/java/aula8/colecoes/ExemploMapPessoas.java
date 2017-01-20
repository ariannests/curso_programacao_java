package aula8.colecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;


public class ExemploMapPessoas {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Map<String, Pessoa> pessoas = new HashMap<String, Pessoa>();
		
		pessoas.put("001", new Pessoa("Joao", "00001", dateFormat.parse("01/01/2000")));
		pessoas.put("002", new Pessoa("Maria", "00002", dateFormat.parse("02/02/2000")));
		pessoas.put("003", new Pessoa("Juca", "00003", dateFormat.parse("03/03/2000")));
		pessoas.put("001", new Pessoa("Ana", "00004", dateFormat.parse("04/04/2000")));

		//set com as chaves do map
		Set<String> chaves = pessoas.keySet();
		
		
		for(String chave : chaves){
			System.out.println(chave);
		}
		
		//colecao com os valores
		System.out.println();
		Collection<Pessoa> valores = pessoas.values();
		for (Pessoa pessoa : valores){
			System.out.println(pessoa);
		}
		
		//
		System.out.println();
		Set<Entry<String, Pessoa>> entry = pessoas.entrySet();
		for(Entry<String, Pessoa> chaveValor : entry){
			String chave = chaveValor.getKey();
			Pessoa value = chaveValor.getValue();
		
			System.out.println(chave + " : " + value);
			
		}
	}
}
