package aula7.exemploClasseAbstrata.funcionario;

public class Gerente extends Funcionario {
	
	public Gerente(String nome, double salario){
		super(nome, salario);
		
	}
		
	@Override
	public double getPorcentagemAdicional() {
		// TODO Auto-generated method stub
		return 0.15;
	}

}
