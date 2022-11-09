package exercicios;

import java.util.Scanner;

public class Exerc004NomeOrdemCorreta {

	public static void main(String[] args) {
		/*
		 * 4 - leia uma lista de 5 nomes pelo tecladoe mostra-losna ordemue foram
		 * inseridas.
		 */

		// variaveis
		String nome[] = new String[5];
		// entrada
		Scanner ler = new Scanner(System.in);
		// processamaneto
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um nome: ");
			nome[i] = ler.nextLine();
		}
		// saida
		for (int i = 0; i < 5; i++) {
			System.out.println("Nome: " + nome[i]);
		}
		ler.close();
	}

}
