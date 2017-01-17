package aula6.exemploHeranca.pessoa;

public class PessoaFisica extends Pessoa{
	private String cpf;

	public PessoaFisica(String nome){
		super(nome);
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString(){
		
		return getNome() + " - " + cpf;
		
	}

}
