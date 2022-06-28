package uninter.entities;

public class Tabuleiro {

	/*
	 * seguindo as regras propostas, o tabuleiro é iniciado vazio
	 * (todos os espaços == 0)
	 */
	public static int[][] tab = {{0, 0, 0},
			{0, 0, 0},
			{0, 0, 0}};
	
	//1 - X - Jogador humano
	//-1 - O - Computador
	//0 - Espaço vazio
	public static boolean vencedor(int[][] tab, int simbolo) {
		/*
		 * verificar se há algum vencedor, em situacao
		 * irá verificar qual foi o vencedor caso seja verdade
		 */
		if ((tab[0][0] == simbolo && tab [0][1] == simbolo && tab [0][2] == simbolo) ||
				(tab[1][0] == simbolo && tab [1][1] == simbolo && tab [1][2] == simbolo) ||
				(tab[2][0] == simbolo && tab [2][1] == simbolo && tab [2][2] == simbolo) ||
				
				(tab[0][0] == simbolo && tab [1][0] == simbolo && tab [2][0] == simbolo) ||
				(tab[0][1] == simbolo && tab [1][1] == simbolo && tab [2][1] == simbolo) ||
				(tab[0][2] == simbolo && tab [1][2] == simbolo && tab [2][2] == simbolo) ||
				
				(tab[0][0] == simbolo && tab [1][1] == simbolo && tab [2][2] == simbolo) ||
				(tab[0][2] == simbolo && tab [1][1] == simbolo && tab [2][0] == simbolo) ) {
			return true;
			}
			return false;
	}
	
	public boolean situacao () { // boolean para verificar se o jogo acabou ou não
		if (vencedor(tab, 1)) {
			visualizar();
			System.out.println("Jogador ganhou!");
			return true;
		}
		
		if (vencedor(tab, -1)) {
			visualizar();
			System.out.println("Computador ganhou!");
			return true;
		}

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] == 0) {
					return false;
				}
			}
		}
		visualizar();
		System.out.println("O jogo empatou! Deu velha");
		return true;
	}

	public void visualizar() {
		for (int i = 0; i < tab.length; i++) {//linhas
			for (int j = 0; j < tab.length; j++) {//colunas
				if(tab[i][j] == 1) {
					System.out.print("X ");
				}
				else if(tab[i][j] == -1) {
					System.out.print("O ");
				}
				else { // = 0
					System.out.print("- ");
				}
			}
			System.out.println();
			
		}
		
	}
}
