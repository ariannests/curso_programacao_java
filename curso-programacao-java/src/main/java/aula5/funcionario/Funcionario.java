package aula5.funcionario;

public class Funcionario {

	private String nome;
	private double salario;
	private String cargo;
	private int porcentagemBonificacao;
	
	public Funcionario(String cargo, String nome, int porcentagemBonificacao, double salario){
		this.setCargo(cargo);
		this.setNome(nome);
		this.porcentagemBonificacao = porcentagemBonificacao;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if (this.salario < salario){
			this.salario = salario;
		}
		else{
			throw new IllegalArgumentException("Salario Invalido");
		}
			this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getPorcentagemBonificacao() {
		return porcentagemBonificacao;
	}
	public void setPorcentagemBonificacao(int porcentagemBonificacao) {
		if (this.porcentagemBonificacao < porcentagemBonificacao){
			this.porcentagemBonificacao = porcentagemBonificacao;
		}
		else {
			throw new IllegalArgumentException("Porcentagem Invalido");
		}
	}
		
		
	
}
	
	
	