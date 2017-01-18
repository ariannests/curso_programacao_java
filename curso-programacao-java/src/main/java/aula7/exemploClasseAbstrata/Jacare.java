package aula7.exemploClasseAbstrata;

import aula7.exemploClasseAbstrata.animal.Reptil;

public class Jacare extends Reptil implements Examinavel{

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som do jacaré...");
		
	}

	@Override
	public void examinar() {
		this.emitirSom();
		
	}

}
