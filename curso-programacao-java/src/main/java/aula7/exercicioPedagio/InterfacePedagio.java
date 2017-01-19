package aula7.exercicioPedagio;

public class InterfacePedagio {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao(); 
		CalculadorPedagio pedagio = new CalculadorPedagio();
		
		
		System.out.println(pedagio.calcular(caminhao));
		System.out.println(pedagio.calcular(carro));
		
	}
}
