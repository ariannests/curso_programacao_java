package aula5.usuario;

public class TestarValidador {
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Arianne", "email@gmail.com", "senha");
		System.out.println("Senha: " + usuario.getSenha());
		
		
		/*
		String senhaValida = "aba254";
		String senhaMenorQueMinimo = "abc1";
		String senhaSemLetra = "12345";
		String senhaSemNumero = "advshs";
		
		System.out.println(senhaValida + " : " + ValidadorSenha.valida(senhaValida));
		System.out.println(senhaMenorQueMinimo + " : " + ValidadorSenha.valida(senhaMenorQueMinimo));
		System.out.println(senhaSemLetra + " : " + ValidadorSenha.valida(senhaSemLetra));
		System.out.println(senhaSemNumero + " : " + ValidadorSenha.valida(senhaSemNumero));
		*/
	}
}
