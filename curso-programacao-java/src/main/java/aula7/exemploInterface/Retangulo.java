package aula7.exemploInterface;

public class Retangulo implements AreaCalculavel {

	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura){
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return largura * altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
