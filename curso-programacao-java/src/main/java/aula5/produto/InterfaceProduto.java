package aula5.produto;

import java.util.Scanner;

public class InterfaceProduto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ControleProduto produtos = new ControleProduto(10);
		int opcao = 0, quantidade = 0; 
		String codigo; 
		
		for(;opcao != 3;){
			System.out.println("");
			System.out.println("1 - Adicionar produto");
			System.out.println("2 - Vender produto");
			System.out.println("3 - Sair");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			if (opcao == 1){
				Produto produto = new Produto();
				
				System.out.println("Codigo: ");
				produto.setCodigo(scanner.nextLine());
				
				System.out.println("Nome: ");
				produto.setNome(scanner.nextLine());
				
				System.out.println("Preço: ");
				produto.setPreco(scanner.nextDouble());
				
				System.out.println("Quantidade: ");
				produto.setQuantidade(scanner.nextInt());
				
				if (produtos.adicionar(produto)){
					System.out.println("Produto adicionado!");
				}
				else{
					System.out.println("Codigo duplicado!");
				}
			}
			
			if (opcao == 2){
				System.out.println("Codigo: ");
				codigo = scanner.nextLine();
				
				System.out.println("Quantidade: ");
				quantidade = scanner.nextInt();
				
				if (produtos.vender(codigo, quantidade) == 1){
					System.out.println("Venda finalizada!");
				}
				else if (produtos.vender(codigo, quantidade) == 2){
					System.out.println("Quantidade indisponível!");
				}
				else if (produtos.vender(codigo, quantidade) == 0){
					System.out.println("Produto nao encontrado!");
				}
			}
		
		
		}
	
	System.out.println("Saindo...");
	
	scanner.close();
	}
}
