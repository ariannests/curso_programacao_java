package aula5.produto;

public class ControleProduto {
	Produto[] produtos; 
	static int CONT = 0; 
	
	public ControleProduto(int quantidade){
		produtos = new Produto[quantidade];
	}
	
	public boolean adicionar(Produto produto){
		if (validaCodigo(produto.getCodigo()) == false){
			produtos[CONT] = produto; 
			CONT++;
			return true;
		}
		return false;
		
	}
	
	public int vender(String codigo, int quantidade){
		if (validaCodigo(codigo)){
			for (int i = 0; i <= CONT; i++){
				if (codigo.equals(produtos[i].getCodigo())){
					if ((produtos[i].getQuantidade() - quantidade) >= 0) {
						quantidade = produtos[i].getQuantidade() -quantidade;
						produtos[i].setQuantidade(quantidade);
						return 1;
					}
					else{
						return 2;
					}
				}
			}
		}
		return 0;
	}
	
	private boolean validaCodigo(String codigo){
		if (CONT > 0){
			//for (Produto produto : produtos){
			
			for (int i = 0; i < CONT; i++){	
				if (codigo.equals(produtos[i].getCodigo())){
					return true;
				}
			}
		}
		return false; 
	}
	
	
		
}
