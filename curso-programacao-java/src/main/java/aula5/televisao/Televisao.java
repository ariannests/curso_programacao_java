package aula5.televisao;

public class Televisao {

	String marca;
	String modelo;
	int altura;
	int largura;
	
	
	public void ligar(){
		ajustarVoltagem();
		regularDiodo();
		ligarTela();
		System.out.println("ligar");
	}
	
	public void desligar(){
		System.out.println("desligar");
		
	}
	
	public void aumentarVolume(){
		System.out.println("aumentarVolume");
	}
	
	public void diminuirVolume(){
		System.out.println("diminuirVolume");
	}
	
	private void ajustarVoltagem(){
		System.out.println("ajustarVoltagem");
	}
	
	public void aumentarCanal(){
		System.out.println("aumentarCanal");
	}
	
	public void diminuirCanal(){
		System.out.println("diminuirCanal");
	}
	
	private void ligarTela(){
		System.out.println("ligarTela");
	}
	
	private void regularDiodo(){
		System.out.println("regularDiodo");
	}
}
