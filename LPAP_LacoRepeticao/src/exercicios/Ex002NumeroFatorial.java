package exercicios;

import java.util.Scanner;

public class Ex002NumeroFatorial {

	public static void main(String[] args) {
		/*
		 * 2 - Escreva um programa que lido um número, calcule e informe o seu fatorial.
		 * Ex.: 5!= 5 * 4 * 3 * 2 * 1 = 120.
		 */
		// variaveis
		int numero;
		int fatorial = 1;

		// entrada
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();

		// processamento
		for (int i = 1; i < numero; i++) {
			fatorial += fatorial * i;
		}

		// saida
		System.out.println(fatorial);

		ler.close();
	}

}
