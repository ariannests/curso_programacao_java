package aula6.exemploHeranca.equipamento;

public class Impressora extends Eletronico {
	
	private int dpi;
	
	public Impressora(double preco, String fabricante, int dpi){
		super(preco, fabricante);
		this.setDpi(dpi);
	}

	public double getDpi() {
		return dpi;
	}

	public void setDpi(int dpi) {
		this.dpi = dpi;
	}

	
}
