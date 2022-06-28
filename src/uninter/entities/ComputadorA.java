package uninter.entities;

/*
 *a classe ComputadorA herda as fun��es de Computador para verificar
 *se o movimento � v�lido e realizar a jogada
 */
public class ComputadorA extends Computador {
	@Override
	public void jogar(int[][] tab) {
		while (true) {
			jogadaAleatoria(tab);
			if (movimentoValido(tab, jogada)) {
				break;
			}
		}
		print(tab, jogada);
	}
}
