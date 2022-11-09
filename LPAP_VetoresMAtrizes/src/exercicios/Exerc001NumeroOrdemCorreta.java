package exercicios;

import java.util.Scanner;

public class Exerc001NumeroOrdemCorreta {

	public static void main(String[] args) {
		/*
		 * 1 - Criar um algoritmo que leia 10 números pelo teclado e exiba os números na
		 * ordem correta que os números foram digitados.
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
		for (int i = 0; i < 10; i++) {
			System.out.println("Numero: " + numero[i]);
		}
		ler.close();
	}

}
