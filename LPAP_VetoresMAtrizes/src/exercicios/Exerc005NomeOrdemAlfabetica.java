package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc005NomeOrdemAlfabetica {

	public static void main(String[] args) {
		/*
		 * 5 - leia uma lista de 5 nomes pelo teclado e mostra-los em ordem alfabetica
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
		
		Arrays.sort(nome); /* Arrays.sort(nome) -> para ordernar por ordem alfabetica*/
		
		// saida
		for (int i = 0; i < 5; i++) {
			System.out.println("Nome: " + nome[i]);
		}
		ler.close();
	}

}
