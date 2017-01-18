package aula7.exemploClasseAbstrata;

import aula7.exemploClasseAbstrata.animal.Mamifero;

public class Baleia extends Mamifero implements Examinavel{

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som da baleia...");
	}

	@Override
	public void examinar() {
		this.emitirSom();
		
	}

	
}
