package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex006Detran {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que ajude o DETRAN a saber, o total de recursos que foram
		 * arrecadados com a aplicação de multas de trânsito. O algoritmo deve ler as
		 * seguintes informações para cada motorista: ◼ -O número da carteira de
		 * motorista (de 1 a 4327) ◼ -Número de multas; ◼ -Valor da cada uma das multas.
		 * ◼ Deve ser impresso o valor da dívida de cada motorista e ao final da leitura
		 * o total de recursos arrecadados (somatório de todas as multas). O algoritmo
		 * deverá imprimir também o número da carteira do motorista que obteve o maior
		 * número de multas
		 */

		// variaveis
		int cartMotorista = 1;
		int numMulta;
		double valorMulta;
		double somaValorMulta = 0;
		double totalArrecadado = 0;
		int maiorNumMulta = 0;
		int maiorNumMultaCarteiraMotorista = 0;
		
		List<String> colecao = new ArrayList<String>();
		
		// entrada e processamento e saida
		Scanner teclado = new Scanner(System.in);

		while (cartMotorista != 0) {
			System.out.println("Digite o número da carteira de motorista: ");
			cartMotorista = teclado.nextInt();
			if (cartMotorista >= 1 & cartMotorista <= 4327) {
				System.out.println("Digite o número de multas do motorista: " + cartMotorista);
				numMulta = teclado.nextInt();
				for (int i = 1; i <= numMulta; i++) {
					System.out.println("Digite o valor da multa: " + i);
					valorMulta = teclado.nextDouble();
					somaValorMulta = somaValorMulta + valorMulta;
				}
				colecao.add("Motorista carteira: " + cartMotorista + " valor divida R$ " + somaValorMulta);
				System.out.println(colecao);
				if (maiorNumMulta < numMulta) {
					maiorNumMulta = numMulta;
					maiorNumMultaCarteiraMotorista = cartMotorista;
				}
			}
			totalArrecadado = totalArrecadado + somaValorMulta;
		}
		for (int j = 0; j < colecao.size(); j++) {
			System.out.println(colecao.get(j));
		}
		System.out.println("O total arrecadado foi: " + totalArrecadado);
		System.out.println("O número da carteira do motorista que obteve o maior número de multas foi: "
				+ maiorNumMultaCarteiraMotorista + " com " + maiorNumMulta+" multas");

		teclado.close();
	}

}
