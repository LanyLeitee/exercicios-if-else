package exercicio1ifelse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int N = sc.nextInt();
		
		if (N<0) {
			System.out.println("N�mero Negativo");
		}
		else {
			System.out.println("N�mero Positivo");
		}
		
		sc.close();
	}
}
