package aula7.exemploClasseAbstrata.funcionario;

public class ExecutarFuncionario {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Joao", 1000);
		Supervisor supervisor = new Supervisor("Claudia", 500);
		Secretaria secretaria = new Secretaria("Dilma", 100);
		
		FolhaPagamento fp = new FolhaPagamento();
		
		System.out.println(fp.calcular(gerente));
	}
}
