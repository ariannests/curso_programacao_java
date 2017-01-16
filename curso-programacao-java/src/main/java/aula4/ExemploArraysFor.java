package aula4;

import java.util.Scanner;

public class ExemploArraysFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] notas = new double[3];
	
		for (int i = 0; i < notas.length; i++){
			System.out.println("Nota: ");
			notas[i] = scanner.nextDouble();
		}
		
		double media = 0;
		
		for (double nota : notas){
			media += nota;
		}
		System.out.println("Media: " + media/notas.length);
		
		scanner.close();
		
	}

}
