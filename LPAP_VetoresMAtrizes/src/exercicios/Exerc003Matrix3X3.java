package exercicios;

import java.util.Scanner;

public class Exerc003Matrix3X3 {

	public static void main(String[] args) {
		/* 3 - Criar um algorítimo que leia a matriz 3x3 e exiba a matriz preenchida */

		// variaveis
		int numeros[][] = new int[3][3];
		// entrada
		Scanner ler = new Scanner(System.in);
		// processamanto
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite um valor para " + i + " , " + j + " : ");
				numeros[i][j] = ler.nextInt();
			}

		}
		// saida
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("matriz " + i + " , " + j + " : " + numeros[i][j]);
			}
		}
		ler.close();

	}

}
