package exercicios;

import java.util.Scanner;

public class Ex001Tabuada {

	public static void main(String[] args) {
		/* 1 - Mostra a Tabuada de numero qualquer. */
		// variavel
		int numero;

		Scanner ler = new Scanner(System.in);
		// entrada
		System.out.println("Digite um numero para a tabuada:");
		numero = ler.nextInt();
		// processamento e saida
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + numero * i);

		}
		ler.close();
	}
}
