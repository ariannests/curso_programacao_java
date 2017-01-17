package aula6.exemploHeranca.equipamento;

public class Televisao extends Eletronico {
	private int polegadas; 
	
	public Televisao(double preco, String fabricante, int polegadas){
		super(preco, fabricante);
		this.setPolegadas(polegadas);
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	

}
