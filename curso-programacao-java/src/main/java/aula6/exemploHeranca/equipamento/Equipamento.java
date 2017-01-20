package aula6.exemploHeranca.equipamento;

public class Equipamento {
	private double preco;
	private String fabricante; 
	
	public Equipamento(double preco, String fabricante){
		this.setPreco(preco);
		this.setFabricante(fabricante); 
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	/**
	 * Matodo que calcula o preco final de um equipamento
	 * 
	 * @return Retorna o preco final do equipamento acrescido do imposto caso necessario
	 */
	public double calcularPrecoFinal(){
		return preco;
	}
	
}
