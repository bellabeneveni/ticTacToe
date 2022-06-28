package uninter.entities;
/*
 *a classe ComputadorB herda as características do ComputadorA,
 *porém, como a dificuldade é diferente, o método "jogar()" terá
 *condições diferentes, pois o computadorB tenta "defender" os 
 *movimentos do jogador, tendo assim o @Override (polimorfismo)
 */
public class ComputadorB extends ComputadorA {

	@Override
	public void jogar(int[][] tab) {
		condicoesDefesa(tab, 1);
		print(tab, jogada);
	}
	
	public void condicoesDefesa(int[][] tab, int simbolo) {
		// evitar que o jogador ganhe na primeira linha	
				if (tab[0][0] == simbolo && tab[0][1] == simbolo && tab[0][2] == 0) jogada = 3;
				else if (tab[0][0] == 0 && tab[0][1] == simbolo && tab[0][2] == simbolo) jogada = 1;
				else if (tab[0][0] == simbolo && tab[0][1] == 0 && tab[0][2] == simbolo) jogada = 2;
			
				// evitar que o jogador ganhe na segunda linha
				else if (tab[1][0] == simbolo && tab[1][1] == 0 && tab[1][2] == simbolo) jogada = 5;
				else if (tab[1][0] == 0 && tab[1][1] == simbolo && tab[1][2] == simbolo) jogada = 4;
				else if (tab[1][0] == simbolo && tab[1][1] == simbolo && tab[1][2] == 0) jogada = 6;
				
				// evitar que o jogador ganhe na terceira linha
				else if (tab[2][0] == simbolo && tab[2][1] == simbolo && tab[2][2] == 0) jogada = 9;
				else if (tab[2][0] == simbolo && tab[2][1] == 0 && tab[2][2] == simbolo) jogada = 8;
				else if (tab[2][0] == 0 && tab[2][1] == simbolo && tab[2][2] == simbolo) jogada = 7;
				
				// evitar que o jogador ganhe na primeira coluna
				else if (tab[0][0] == simbolo && tab[1][0] == simbolo && tab[2][0] == 0) jogada = 7;
				else if (tab[0][0] == simbolo && tab[1][0] == 0 && tab[2][0] == simbolo) jogada = 4;
				else if (tab[0][0] == 0 && tab[1][0] == simbolo && tab[2][0] == simbolo) jogada = 1;
				
				// evitar que o jogador ganhe na segunda coluna
				else if (tab[0][1] == simbolo && tab[1][1] == simbolo && tab[2][2] == 0) jogada = 9;
				else if (tab[0][1] == simbolo && tab[1][1] == 0 && tab[2][2] == simbolo) jogada = 5;
				else if (tab[0][1] == 0 && tab[1][1] == simbolo && tab[2][2] == simbolo) jogada = 4;
				
				// evitar que o jogador ganhe na terceira coluna
				else if (tab[0][2] == simbolo && tab[1][2] == simbolo && tab[2][2] == 0) jogada = 9;
				else if (tab[0][2] == 0 && tab[1][2] == simbolo && tab[2][2] == simbolo) jogada = 3;
				else if (tab[0][2] == simbolo && tab[1][2] == 0 && tab[2][2] == simbolo) jogada = 6;
				
				// evitar que o jogador ganhe na primeira diagonal (esquerda para direita)
				else if (tab[0][0] == simbolo && tab[1][1] == simbolo && tab[2][2] == 0) jogada = 9;
				else if (tab[0][0] == 0 && tab[1][1] == simbolo && tab[2][2] == simbolo) jogada = 1;
				else if (tab[0][0] == simbolo && tab[1][1] == 0 && tab[2][2] == simbolo) jogada = 5;
				
				// evitar que o jogador ganhe na segunda diagonal (direita para esquerda)
				else if (tab[0][2] == simbolo && tab[1][1] == simbolo && tab[2][0] == 0) jogada = 7;
				else if (tab[0][2] == simbolo && tab[1][1] == 0 && tab[2][0] == simbolo) jogada = 5;
				else if (tab[0][2] == 0 && tab[1][1] == simbolo && tab[2][0] == simbolo) jogada = 3;
				else {
					while (true) {
						jogadaAleatoria(tab);
						if (movimentoValido(tab, jogada)) {
							break;
						}
					}
				}
	}
}
