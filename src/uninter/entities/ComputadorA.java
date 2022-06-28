package uninter.entities;

/*
 *a classe ComputadorA herda as funções de Computador para verificar
 *se o movimento é válido e realizar a jogada
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
