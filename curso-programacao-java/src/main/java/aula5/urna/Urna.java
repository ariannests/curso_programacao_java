package aula5.urna;

public class Urna {

	Candidato[] candidatos;
	static int NULO = 0;
	
	public Urna(Candidato[] candidatos){
		this.candidatos = candidatos;
		
	}
	
	public void votar(int numero){
		//for (Candidato candidato : candidatos){
		for (int i = 0; i < candidatos.length && candidatos[i] != null; i++){	
			if (numero == candidatos[i].getNumero()){
				candidatos[i].setVotos(1);
				return;
			}
	
		}
		NULO++; 
	}

}

	