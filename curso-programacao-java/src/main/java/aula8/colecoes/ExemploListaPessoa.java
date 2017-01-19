package aula8.colecoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploListaPessoa {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("Joao", "00001", dateFormat.parse("01/01/2000")));
		pessoas.add(new Pessoa("Maria", "00002", dateFormat.parse("02/02/2000")));
		pessoas.add(new Pessoa("Juca", "00003", dateFormat.parse("03/03/2000")));
		pessoas.add(new Pessoa("Ana", "00004", dateFormat.parse("04/04/2000")));
		pessoas.add(new Pessoa("Pedro", "00005", dateFormat.parse("05/05/2000")));
		
		
		Collections.sort(pessoas);
		
		
		
		for(Pessoa pessoa : pessoas){
			System.out.println(pessoa);
		}
		
		
		pessoas.remove(new Pessoa("Juca", "00003", dateFormat.parse("03/03/2000")));
	
		System.out.println();
		for(Pessoa pessoa : pessoas){
			System.out.println(pessoa);
		}
		
	}
}
