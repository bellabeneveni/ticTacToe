package uninter.entities;

public class ComputadorC extends ComputadorB {

	/*
	 * herda as características do ComputadorB, mas com algumas peculiaridades de 
	 * verificação na função jogar
	 */
	@Override
	public void jogar(int[][] tab) {
		// computador inicia pelo meio para aumentar as chances de ganhar
		if(tab[1][1] == 0) {
			jogada = 5;
		}
		/*
		 * no nível difícil, primeiro ele tenta ganhar (faz a verificação de já tem 2 casas do seu próprio símbolo)
		 * se não, tenta defender, se não precisar defender, então a jogada será aleatória
		 */
		else {
			condicoesDefesa(tab, -1);
			condicoesDefesa(tab, 1);
		}
		print(tab, jogada);
	}
}
