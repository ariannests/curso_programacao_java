package aula5.usuario;

public class TestarGerenciadorUsuario {
	public static void main(String[] args) {
		GerenciadorUsuario gerenciador = new GerenciadorUsuario();
		
		try{
			gerenciador.validar("admin@email.com", "123");
			System.out.println("Usuario Valido");	
		} catch (UsuarioInvalidoException e){
			System.out.println(e.getMessage());	
		} finally {
			System.out.println("Executando finally");
		}
		
		System.out.println("Fim");
	}
}
