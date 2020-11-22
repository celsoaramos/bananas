package com.monkeys.islands.bananas;

public class BananasApplication {

	/**
	 * A intenção do método é percorrer o array bidimensional de trás para frente, ou seja,
	 * passando pelas linhas da última coluna até percorrer as linhas da primeira coluna.
	 * 
	 * Em cada iteração forma-se um novo array com os dados obtidos na iteração.
	 * Logo, na primeira coluna surgirá o array de maior valor.
	 * 
	 * font de estudo:
	 * https://www.youtube.com/watch?v=6rqcqUyyXvM
	 * 
	 * @param bananas - array bidimensional.
	 * @param l - quantidade de linhas.
	 * @param c - quantidade de colunas.
	 * @return o maior número de bananas.
	 */
	static int numeroMaximoBanana(int bananas[][], int l, int c) {

		// cria uma tabela para guardar os resultados das iterações 
		int tabelaAuxiliar[][] = new int[l][c];

		// percorre a coluna de trás para frente
		for (int col = c - 1; col >= 0; col--) {
			
			// percorre a linha
			for (int linha = 0; linha < l; linha++) {

				// pega o valor a direita
				// na última coluna nunca vai ter valor a direita
				int direita = (col == c - 1) ? 0 : tabelaAuxiliar[linha][col + 1];

				// pega o valor a direita pra cima (/)
				// na última coluna nunca vai ter valor a direita acima
				// na primeira linha nunca vai ter valor direita acima
				int direitaAcima = (linha == 0 || col == c - 1) ? 0 : tabelaAuxiliar[linha - 1][col + 1];

				// pega o valor a direita para baixo (\)
				// na última coluna nunca vai ter valor a direita abaixo
				// na última linha nunca vai ter valor direita abaixo
				int direitaAbaixo = (linha == l - 1 || col == c - 1) ? 0 : tabelaAuxiliar[linha + 1][col + 1];

				// soma o valor atual com o maior valor entre os 3 itens acima
				tabelaAuxiliar[linha][col] = bananas[linha][col] + Math.max(direita, Math.max(direitaAcima, direitaAbaixo));
				
			}
		}

		// Percorre a lista para ver qual é o maior número
		// O maior número estará na primeira coluna
		int res = tabelaAuxiliar[0][0];
		for (int i = 1; i < l; i++) {
			res = Math.max(res, tabelaAuxiliar[i][0]);
		}

		// retorna o maior número
		return res;
	}

	
	public static void main(String arg[]) {

		////// PRIMEIRO TESTE //////
		
		// dados de entrada
		int bananas[][] = {
							{1, 3, 3},
							{2, 1, 4},
							{0, 6, 4}
						  };
		// quantidade de linha e coluna respectivamente
		int l = bananas.length, c = bananas[0].length;

		// resultado esperado 12
		System.out.println(numeroMaximoBanana(bananas, l, c));
		
		
		////// SEGUNDO TESTE //////
		
		// dados de entrada
		int bananas2[][] = {
							{1, 3, 1, 5},
							{2, 2, 4, 1},
							{5, 0, 2, 3},
							{0, 6, 1, 2}
						  };
		// quantidade de linha e coluna respectivamente
		int l2 = bananas2.length, c2 = bananas2[0].length;
		
		// resultado esperado 16
		System.out.println(numeroMaximoBanana(bananas2, l2, c2));
		
		
		////// TERCEIRO TESTE //////
		
		// dados de entrada
		int bananas3[][] = {
							{10, 33, 13, 15},
							{22, 21, 04,  1},
							{ 5,  0,  2,  3},
							{ 0,  6, 14,  2}
						  };
		// quantidade de linha e coluna respectivamente
		int l3 = bananas3.length, c3 = bananas3[0].length;
		
		// resultado esperado 83
		System.out.println(numeroMaximoBanana(bananas3, l3, c3));
		
	}
}
