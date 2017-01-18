package aula7.exercicioPedagio;

public class CalculadorPedagio {
	
	private double valorPedagio = 5.50; 
	
	public double calcular(PagaPedagio veiculo){
		
		return valorPedagio * veiculo.eixos();
		
	}

}
