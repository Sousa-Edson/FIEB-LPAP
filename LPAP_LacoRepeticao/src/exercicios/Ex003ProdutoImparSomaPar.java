package exercicios;

import java.util.Scanner;

public class Ex003ProdutoImparSomaPar {

	public static void main(String[] args) {
		/*
		 * 3 - Crie um algoritmo que o usuário entre com vários números inteiros e
		 * positivos e imprima o produto dos números ímpares e a soma dos números pares.
		 */
		// variaveis
		int numero = 0;
		int produtoImpar = 0;
		int somaPares = 0;

		// entrada
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero positivo e para finalizar um negativo ou zero: ");
		numero = ler.nextInt();

		// processamento
		while (numero > 0) {
			if (numero % 2 == 0) {
				somaPares = somaPares + numero;
				System.out.println("pares: " + somaPares);
			} else {
				if (produtoImpar == 0) {
					produtoImpar = 1;
				}
				produtoImpar = produtoImpar * numero;
				System.out.println("impares: " + produtoImpar);
			}

			System.out.println("Digite um numero positivo e para finalizar um negativo ou zero: ");
			numero = ler.nextInt();
		}

		// saida
		System.out.println(
				"O produto dos números impares é : " + produtoImpar + "  e a soma dos números pares é : " + somaPares);
		ler.close();
	}

}
