package exercicios;

public class Ex004AlturaChicoJuca {

	public static void main(String[] args) {
		/*
		 * 4 - Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca tem 1,10m e
		 * cresce 3 centímetros por ano. Construir um algoritmo que calcule e imprima
		 * quantos anos serão necessários para que Juca seja maior que Chico.
		 */
		// variaveis
		double chico=1.5;
		double juca = 1.1;
		int anos=0;
		
		// entrada
		// processamento
		while (chico > juca) {
			chico = chico + 0.02;
			juca = juca + 0.03;
			 anos++;
		}
		// saida
		System.out.println("Serão necessários "+anos+" anos para que Juca seja maior que Chico."+chico+" "+juca);

	}

}
