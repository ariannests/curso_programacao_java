package aula5.usuario;

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	
	public Usuario(String nome, String email, String senha){
		this.setEmail(email);
		this.setNome(nome); 
		this.setSenha(senha);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		if (!ValidadorSenha.valida(senha)){
			throw new IllegalArgumentException("Senha Invalida");
		}
		
		this.senha = senha;
		
	}
	
}
