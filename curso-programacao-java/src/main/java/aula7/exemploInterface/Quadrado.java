package aula7.exemploInterface;

public class Quadrado implements AreaCalculavel{
	private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
		
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}
}
