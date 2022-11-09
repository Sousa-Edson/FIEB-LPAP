package exercicios;

import java.util.Scanner;

public class Ex007PesquisaHabitantes {

	public static void main(String[] args) {
		/*
		 * Foi feita uma pesquisa entre os habitantes de uma região e coletados os dados
		 * de altura e sexo (0=masc, 1=fem) das pessoas. Faça um programa que leia 50
		 * dados diferentes e informe: ◼ a maior e a menor altura encontradas; ◼ a média
		 * de altura das mulheres; ◼ a média de altura da população; ◼ o percentual de
		 * homens na população
		 */
		// variaveis
		int i = 1;
		int sexo;
		int numMulher = 0;
		int numHomen = 0;
		double altura = 0.0;
		double alturaMulheres = 0.0;
		double alturaPopulacao = 0.0;
		double mediaAlturaMulheres = 0.0;
		double mediaAlturaPopulacao = 0.0;
		double maiorAltura = 0;
		double menorAltura = 0;
		double porcentHomen;

		// entrada
		Scanner teclado = new Scanner(System.in);
		while (i <= 50) {

			System.out.println("Pesquisa número " + i);
			System.out.println("Digite sexo (0=masc, 1=fem): ");
			sexo = teclado.nextInt();
			if (sexo >= 0 & sexo <= 1) {
				System.out.println("Digite a altura: ");
				altura = teclado.nextDouble();
				if (maiorAltura < altura) {
					maiorAltura = altura;
					
				}
				if (menorAltura == 0) {
					menorAltura = altura;
				}
				if (menorAltura > altura) {
					menorAltura = altura;
					System.out.println("a menor altura é = " + menorAltura);
				}
				alturaPopulacao = alturaPopulacao + altura;
				i++;
			}

			if (sexo == 1) {
				alturaMulheres = alturaMulheres + altura;
				numMulher++;
				System.out.println(numMulher);
			} else {
				numHomen++;
			}

		}

		// processamento
		mediaAlturaMulheres = alturaMulheres / numMulher;
		mediaAlturaPopulacao = alturaPopulacao / i;
		porcentHomen = (double) numHomen / (i - 1) * 100;

		System.out.println("valor de i = " + i);
		System.out.println("valor de homen = " + numHomen);

		// saida
		System.out.println("A menor altura encontrada foi: " + menorAltura);
		System.out.println("A maior altura encontrada foi: " + maiorAltura);
		System.out.println("A média de altura das mulheres é: " + mediaAlturaMulheres);
		System.out.println("A média de altura da população é: " + mediaAlturaPopulacao);
		System.out.println("A porcentagem de homens é: " + porcentHomen + "%");

		teclado.close();
	}

}
