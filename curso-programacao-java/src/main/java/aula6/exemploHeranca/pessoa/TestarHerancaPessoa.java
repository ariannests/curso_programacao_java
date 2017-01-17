package aula6.exemploHeranca.pessoa;

public class TestarHerancaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Teste");
		PessoaFisica pessoaFisica = new PessoaFisica("Teste");
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Teste");
		
		pessoa.setNome("Pessoa");
		pessoaFisica.setNome("Pessoa Fisica");
		pessoaFisica.setCpf("010203");

		pessoaJuridica.setNome("Pessoa Juridica");
		pessoaJuridica.setCnpj("050607");
		
		System.out.println(pessoa);
		System.out.println(pessoaFisica);
		System.out.println(pessoaJuridica);
		
	}
}
