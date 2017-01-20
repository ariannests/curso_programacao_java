package aula9.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import javax.swing.Box.Filler;



public class ExemploStream {
	private static final String  NOME_ARQUIVO = "/home/java04/meu-arquivo.txt";
	
	public static void main(String[] args) throws IOException {
		escreverNoArquivo();
		System.out.println("Arquivo gravado com sucesso");
		System.out.println(lerArquivo());
	}
	
	public static String lerArquivo() throws IOException{
		StringBuilder conteudo = new StringBuilder();
		
		FileInputStream fileInputStream = new FileInputStream(NOME_ARQUIVO);
		
		try{
			//char letra = (char) fileInputStream.read();
			
			int read = fileInputStream.read();
			while (read != -1){
				conteudo.append((char) read);
				read = fileInputStream.read();
			}
		} finally{
			fileInputStream.close();
		}
		return conteudo.toString();
		
	}
	
	public static void escreverNoArquivo() throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream(NOME_ARQUIVO);
		
		try{
//			Charset charset = Charset.defaultCharset();
			String conteudo = "Conteudo \n";
			fileOutputStream.write(conteudo.getBytes());
		} finally{
			fileOutputStream.close();
		}
	}

}
