package exercicioNotas;

import java.util.Scanner;

public class RecebeNotas {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantidade de alunos: ");
		int qtd = scanner.nextInt();
		scanner.nextLine();
		
		Aluno[] alunos = new Aluno[qtd];
		
		for(int i = 0; i < qtd; i++){
			System.out.println("Nome aluno: ");
			String nome = scanner.nextLine();
			Aluno aluno = new Aluno(nome);
			
			for(int j = 0; j < aluno.notas.length; j++){
				System.out.println("Nota " + j + ": ");
				double nota = scanner.nextInt();
				aluno.notas[j] = nota;
			}
				
			alunos[i] = aluno;
 		}
		
		
		
			
		
		
		for(Aluno aluno : alunos){
			System.out.println(aluno.nome);
		}
		
		scanner.close();
	}
}
