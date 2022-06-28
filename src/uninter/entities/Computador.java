package uninter.entities;

import java.util.Random;
/*
 * a classe Computador herda as fun��es de Movimentos para verificar
 * se o movimento � v�lido, imprimir e realizar a jogada
 */

public class Computador extends Movimentos {
	Random rand = new Random();
	int jogada;

	public void jogar(int[][] tab) {
		print(tab, jogada);
	}
	
	public void jogadaAleatoria(int[][] tab) {
		// a jogada aleat�ria ser� de 1 a 9
		jogada = rand.nextInt(9) + 1;
	}
	
	public void print(int[][] tab, int jogada) {
		if (movimentoValido(tab, jogada)) {
			System.out.println("Jogada Computador");
			System.out.println("Computador escolheu " + jogada);
			realizarMovimento(tab, jogada, -1);
		}
	}
}
