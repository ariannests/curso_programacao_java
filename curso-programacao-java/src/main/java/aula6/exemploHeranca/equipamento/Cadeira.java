package aula6.exemploHeranca.equipamento;

public class Cadeira extends Equipamento {

	private String material;
	
		public Cadeira(double preco, String fabricante, String material){
			super(preco, fabricante);
			this.setMaterial(material);
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}
}
