package exercicioBiblioteca;

import java.util.Scanner;

public class InterfaceUsuario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 100;
		Biblioteca biblioteca = new Biblioteca(n);
		//System.out.println(biblioteca.livro[0]);
		
		int opcao = 0,
			qtd = 0,
			x = 0;
		String autor, titulo, data, codigo;
		 
		
		for(;opcao != 5;){
			System.out.println("");
			System.out.println("1 - Adicionar livro");
			System.out.println("2 - Buscar livro");
			System.out.println("3 - Remover livro");
			System.out.println("4 - Listar livros");
			System.out.println("5 - Sair");
			opcao = scanner.nextInt();
			scanner.nextLine();
			 
			if (opcao == 1){
				
				//if (biblioteca.adicionar(qtd, "Joao", "Casa do Joao", "20/01/2017", "CHU6") == true){
				//System.out.println("Informe o codigo do livro: ");
				System.out.println("Codigo: ");
				codigo = scanner.nextLine();
				
				if (biblioteca.verificarCodigo(qtd, codigo) == false || qtd == 0){
					Livro livro = new Livro();
					
					qtd++;
					System.out.println("Autor: ");
					livro.autor = scanner.nextLine();
					System.out.println("Titulo: ");
					livro.titulo = scanner.nextLine();
					System.out.println("Data P: ");
					livro.dataPublicacao = scanner.nextLine();
					biblioteca.adicionar(qtd, livro);
					
				}
				else
					System.out.println("Codigo duplicado!");
				
			}
			if (opcao == 2){
				System.out.println("Codigo: ");
				codigo = scanner.nextLine();
				
				if (biblioteca.verificarCodigo(qtd, codigo)){
					x = biblioteca.buscar(codigo);
					System.out.println("Autor: " + biblioteca.livro[x].autor);
					System.out.println("Titulo: " + biblioteca.livro[x].titulo);
					System.out.println("Data: " + biblioteca.livro[x].dataPublicacao);
						
				}
				else
					System.out.println("Livro nao encontrado!");
				
			if (opcao == 4){
				for (int i = 0; i < biblioteca.livro.length; i++){
					System.out.println("");
					System.out.println("Codigo: " + biblioteca.livro[i].codigo);
					System.out.println("Autor: " + biblioteca.livro[i].autor);
					System.out.println("Titulo: " + biblioteca.livro[i].titulo);
					System.out.println("Data: " + biblioteca.livro[i].dataPublicacao);
				}
			}
			}
	
		}	
		scanner.close();

	
}
}