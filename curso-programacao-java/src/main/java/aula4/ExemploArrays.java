package aula4;

import java.util.Scanner;

public class ExemploArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] nota = new double[3];
	
		
		System.out.println("Primeira nota: ");
		nota[0] = scanner.nextDouble();
		
		System.out.println("Primeira nota: ");
		nota[1] = scanner.nextDouble();
		
		System.out.println("Primeira nota: ");
		nota[2] = scanner.nextDouble();
		
		double media = (nota[0] + nota[1] + nota[2]) / 3;
		System.out.println("Media: " + media);

		scanner.close();
		
	}
}
