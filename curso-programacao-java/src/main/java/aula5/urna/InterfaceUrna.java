package aula5.urna;

import java.util.Scanner;

public class InterfaceUrna {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Candidato[] candidatos = new Candidato[10];
		
		Candidato c = new Candidato();
		
		c.setNome("Joao");
		c.setPartido("PTB");
		c.setNumero(15);
		candidatos[0] = c;

		Candidato c1 = new Candidato();

		c1.setNome("Jose");
		c1.setPartido("PTC");
		c1.setNumero(25);
		candidatos[1] = c1;

		
		Candidato c2 = new Candidato();
		
		c2.setNome("Claudio");
		c2.setPartido("PFB");
		c2.setNumero(35);
		candidatos[2] = c2;
		
		
		Candidato c3 = new Candidato();

		c3.setNome("Maria");
		c3.setPartido("PUB");
		c3.setNumero(45);
		candidatos[3] = c3;
		

		Candidato c4 = new Candidato();

		c4.setNome("Joana");
		c4.setPartido("PTU");
		c4.setNumero(55);
		candidatos[4] = c4;
		
		Urna urna = new Urna(candidatos);
		int opcao = 0; 
		
		
		for(;opcao != 2;){
			
			System.out.println("1 - Votar");
			System.out.println("2 - Sair");
			opcao = scanner.nextInt();
			
			if (opcao == 1){
				System.out.println("Numero do candidato: ");
				urna.votar(scanner.nextInt());
			}
		
		}
		
		System.out.println("");
		for (int i = 0; i < candidatos.length && candidatos[i] != null; i++){
			System.out.println(candidatos[i].toString());
		}
		System.out.println("Votos nulos: " + Urna.NULO);
		scanner.close();
	}
}
