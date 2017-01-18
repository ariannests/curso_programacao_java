package aula7.exemploInterface;

public class ExecutarInterface {
	public static void main(String[] args) {
		AreaCalculavel circulo = new Circulo(5.1);
		AreaCalculavel quadrado = new Quadrado(4);
		AreaCalculavel retangulo = new Retangulo(4,8);
		CalculadorArea calculador = new CalculadorArea();
		
		System.out.println(calculador.calcular(circulo));
		System.out.println(calculador.calcular(quadrado));
		System.out.println(calculador.calcular(retangulo));
	}
}
