package aula6.exemploHeranca.equipamento;

public class TestarEquipamento {
	public static void main(String[] args) {
//		Equipamento equipamento = new Equipamento(1.1, "teste_equipamento");
		Impressora impressora = new Impressora(100, "teste_impressora", 22);
		Cadeira cadeira = new Cadeira(50, "teste_cadeira", "madeira");
		Televisao televisao = new Televisao(3000, "teste_tv", 48);
		
		System.out.println("Impressora: " + impressora.calcularPrecoFinal());
		System.out.println("Cadeira: " + cadeira.calcularPrecoFinal());
		System.out.println("Televisao: " + televisao.calcularPrecoFinal());
		
	}
}
