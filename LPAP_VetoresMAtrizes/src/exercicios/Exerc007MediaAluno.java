package exercicios;

import java.util.Scanner;  


public class Exerc007MediaAluno {

	public static void main(String[] args) {
		/*
		 * 7 - Receba pelo teclado o nome, nota 1, nota 2, nota 3 de cada aluno, calcule
		 * a média de cada aluno e apresente a lista de alunos e médias ao final do
		 * programa.
		 */
		// variaveis
		double n1, n2, n3, mf;
		String nome;
		String aluno[][];
		int qtd = 0;

		// entrada e processamanto
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite quantidade de aluno: ");
		qtd = ler.nextInt();
		ler.nextLine();
		aluno = new String[qtd][2];
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite nome aluno: ");
			nome = ler.nextLine();
			nome = nome.substring(0, 1).toUpperCase() + nome.substring(1); // para deixa a primeira letra maiuscula
			System.out.println("Digite nota 1: ");
			n1 = ler.nextDouble();
			System.out.println("Digite nota 2: ");
			n2 = ler.nextDouble();
			System.out.println("Digite nota 3: ");
			n3 = ler.nextDouble();
			mf = (n1 + n2 + n3) / 3;
			ler.nextLine();
//			System.out.println(mf);
			aluno[i][0] = nome;
			aluno[i][1] = "" + mf;

//			System.out.println(id);
		}

		// saida
		for (int i = 0; i < qtd; i++) {
			System.out.println("Aluno: " + aluno[i][0] + " Média: " + aluno[i][1]);
		}

		ler.close();
	}

}
