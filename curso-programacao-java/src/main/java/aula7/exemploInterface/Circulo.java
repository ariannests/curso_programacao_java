package aula7.exemploInterface;

public class Circulo implements AreaCalculavel{
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return raio * raio * Math.PI;
	}
	
}
