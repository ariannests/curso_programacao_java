package exercicioBiblioteca;

public class Biblioteca {

	Livro[] livro; 
	
	public Biblioteca(int n){
	
		this.livro = new Livro[n]; 
	}
	
	public boolean verificarCodigo(int qtd, String codigo){
		
		for (int i = 0; i < qtd; i++){
				if (livro[i].codigo == codigo){
					return true;					
				}
		}
		return false;
		
	}
		
	
	public void adicionar(int qtd, Livro livro){
		
		this.livro[qtd - 1] = livro;
	
	}
	

	
	public int buscar(String codigo){
		int i = 0;
		for (; i < livro.length; i++){
			if (livro[i].codigo == codigo){
				//System.out.println(livro[i]);
				break;
			}
		}
		return i;

		
	}
}
