package uninter.entities;

import java.util.Scanner;

/*
 *a classe Jogador herda as fun��es de Movimentos para verificar
 *se o movimento � v�lido e realizar a jogada
 */
public class Jogador extends Movimentos {
	char simbolo = 'X';
	Scanner scanner = new Scanner(System.in);

	public void jogar() {
		int jogada;
		while (true) {
			System.out.println("Entre com a sua jogada!");
			jogada = scanner.nextInt();
			if (movimentoValido(Tabuleiro.tab, jogada)){
				break;
			} else {
				System.out.println(jogada + " n�o � uma jogada v�lida");
			}
		}
		realizarMovimento(Tabuleiro.tab, jogada, 1);
	}
}
