package uninter.entities;

/*
 * optei por criar esta classe que será utilizada por todas as outras entidades,
 * pois, a cada movimento a ser realizado, é preciso verificar se é válido e
 * então realizar o movimento
 */
public class Movimentos {

	int posicao;

	protected static boolean movimentoValido (int[][] tab, int posicao) {
		switch(posicao) {
			case 1:
				return (tab[0][0] == 0);
			case 2:
				return (tab[0][1] == 0);
			case 3:
				return (tab[0][2] == 0);
			case 4:
				return (tab[1][0] == 0);
			case 5:
				return (tab[1][1] == 0);
			case 6:
				return (tab[1][2] == 0);
			case 7:
				return (tab[2][0] == 0);
			case 8:
				return (tab[2][1] == 0);
			case 9:
				return (tab[2][2] == 0);
			default:
				return false;
		}
	}
	
	protected static void realizarMovimento(int[][] tab, int posicao, int simbolo) {
		switch(posicao) {
		case 1:
			tab[0][0] = simbolo;
			break;
		case 2:
			tab[0][1] = simbolo;
			break;
		case 3:
			tab[0][2] = simbolo;
			break;
		case 4:
			tab[1][0] = simbolo;
			break;
		case 5:
			tab[1][1] = simbolo;
			break;
		case 6:
			tab[1][2] = simbolo;
			break;
		case 7:
			tab[2][0] = simbolo;
			break;
		case 8:
			tab[2][1] = simbolo;
			break;
		case 9:
			tab[2][2] = simbolo;
			break;
		default:
			System.out.println(":(");
		}
	}
}
