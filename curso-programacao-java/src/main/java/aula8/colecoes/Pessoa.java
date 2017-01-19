package aula8.colecoes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private Date data;
	private String cpf;
	
	public Pessoa(String nome, String cpf, Date data) {
		this.cpf = cpf;
		this.data = data;
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		return nome + " " + this.cpf + " " + dateFormat.format(this.data); 
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	@Override
	public int compareTo(Pessoa outraPessoa) {
		
		return getNome().compareTo(outraPessoa.nome);
	}
	
	
	
	
}
