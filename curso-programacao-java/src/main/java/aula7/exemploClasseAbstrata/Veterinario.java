package aula7.exemploClasseAbstrata;

import aula7.exemploClasseAbstrata.animal.Animal;

public class Veterinario extends Humano {
	
	public void examinar(Examinavel animal){
		animal.examinar();
	}
}
