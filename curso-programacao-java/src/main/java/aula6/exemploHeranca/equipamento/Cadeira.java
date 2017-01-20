package aula6.exemploHeranca.equipamento;

/**
 * Classe que representa uma cadeira
 * @author Ariannne Santos da Silva
 * 
 * 
 *
 */

public class Cadeira extends Equipamento {

	/**
	 * Atributo que armazena material 
	 */
	private String material;
	
		/**
		 * 
		 * @param preco Preco da cadeira
		 * @param fabricante da cadeira
		 * @param material de fabricacao da cadeira
		 */
	
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
