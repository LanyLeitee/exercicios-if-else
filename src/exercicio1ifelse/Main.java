package exercicio1ifelse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		
		int N = sc.nextInt();
		
		if (N<0) {
			System.out.println("Número Negativo");
		}
		else {
			System.out.println("Número Positivo");
		}
		
		sc.close();
	}
}
