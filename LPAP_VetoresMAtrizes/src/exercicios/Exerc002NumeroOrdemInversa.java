package exercicios;

import java.util.Scanner;

public class Exerc002NumeroOrdemInversa {

	public static void main(String[] args) {
		/*
		 * 2 - Criar um algoritmo que leia 10 números pelo teclado e exiba os números na
		 * ordem inversa da que os números foram digitados.
		 * 
		 */

		// variaveis
		int numero[] = new int[10];
		// entrada
		Scanner ler = new Scanner(System.in);
		// processamaneto
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			numero[i] = ler.nextInt();
		}
		// saida
		for (int i = 9; i >= 0; i--) {
			System.out.println("Numero: " + numero[i]);
		}
		ler.close();
	}

}
