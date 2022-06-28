package uninter.entities;

public class ComputadorC extends ComputadorB {

	/*
	 * herda as caracter�sticas do ComputadorB, mas com algumas peculiaridades de 
	 * verifica��o na fun��o jogar
	 */
	@Override
	public void jogar(int[][] tab) {
		// computador inicia pelo meio para aumentar as chances de ganhar
		if(tab[1][1] == 0) {
			jogada = 5;
		}
		/*
		 * no n�vel dif�cil, primeiro ele tenta ganhar (faz a verifica��o de j� tem 2 casas do seu pr�prio s�mbolo)
		 * se n�o, tenta defender, se n�o precisar defender, ent�o a jogada ser� aleat�ria
		 */
		else {
			condicoesDefesa(tab, -1);
			condicoesDefesa(tab, 1);
		}
		print(tab, jogada);
	}
}
