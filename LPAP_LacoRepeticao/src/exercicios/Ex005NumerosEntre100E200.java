package exercicios;

import java.util.Scanner;

public class Ex005NumerosEntre100E200 {

	public static void main(String[] args) {
		/*
		 * 5 - Faça um algoritmo que leia vários números e informe quantos desses
		 * números entre 100 e 200 foram digitados. Quando o valor 0 (zero) for lido o
		 * algoritmo deverá cessar sua execução.
		 */
		// variaveis
		int numero;
		int contados = 0;

		// entrada
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = ler.nextInt();

		// processamento
		while (numero > 0) {
			if (numero >= 100 & numero <= 200) {
				contados++;
			}
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
		}
		// saida
		System.out.println("Foram digitados " + contados + " entre 100 e 200.");
		ler.close();
	}

}
