package aula5.urna;

public class Candidato {
	
	private String nome; 
	private String partido;
	private int numero;
	private int votos; 
	
	public String toString(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(this.nome + " " + this.votos);
		return stringBuffer.toString();
	}
	
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos += votos;
	} 
	

}
