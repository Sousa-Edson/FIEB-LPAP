package exercicios;

import java.util.Scanner;

public class Exerc006NomeEmailIdade {

	public static void main(String[] args) {
		/*
		 * 6 - ler uma lista de 5 nomes, email e idade e lista-los na tela
		 */
		// variaveis
		String pessoa[][] = new String[5][3];
		String texto;
		// entrada
		Scanner ler = new Scanner(System.in);
		// processamanto
		for (int i = 0; i < 5; i++) {
			System.out.println("--------------------------" + i);
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					texto = "Nome";
				} else if (j == 1) {
					texto = "Email";
				} else {
					texto = "Idade";
				}
				System.out.println(texto + " : ");
				pessoa[i][j] = ler.nextLine();
			}

		}
		// saida
		for (int i = 0; i < 5; i++) {
//			System.out.println("Pessoa " + i);
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					texto = "Nome";
				} else if (j == 1) {
					texto = "Email";
				} else {
					texto = "Idade";
				}

				System.out.println(texto + " : " + pessoa[i][j]);

			}
			System.out.println("-------------------------------------------");
		}
		ler.close();

	}

}
