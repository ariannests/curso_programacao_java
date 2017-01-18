package aula7.exemploClasseAbstrata;

import aula7.exemploClasseAbstrata.animal.Mamifero;

public class Humano extends Mamifero{

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som do humano...");
		
	}
	
}
