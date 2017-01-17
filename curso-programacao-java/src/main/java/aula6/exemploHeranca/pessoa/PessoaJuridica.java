package aula6.exemploHeranca.pessoa;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public PessoaJuridica(String nome){
		super(nome);
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String toString(){
		
		return getNome() + " - " + cnpj;
		
	}
}
