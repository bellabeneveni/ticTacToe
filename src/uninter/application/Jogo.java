package uninter.application;

import uninter.entities.ComputadorA;
import uninter.entities.ComputadorB;
import uninter.entities.ComputadorC;
import uninter.entities.Jogador;
import uninter.entities.Tabuleiro;
import java.util.Scanner;

public class Jogo {

	/*
	 * aluna Isabella Maria Navarro Beneveni Smith
	 * RU 3562450
	 */
	// foram criados pacotes diferentes: um para a aplica��o e outro para as classesdos objetos (entidades) que ser�o utilizados
	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		Tabuleiro tab = new Tabuleiro();
		ComputadorA comp = new ComputadorA();

		// este teclado servir� apenas para a escolha da dificuldade, quando o jogador realizar a jogada, existir� um scanner pr�prio do Jogador
		Scanner teclado = new Scanner(System.in);
		System.out.println("Jogo da velha");
		System.out.println("Dificuldades:\n1 = F�cil\n2 = M�dia\n3 = Dif�cil");
		try {
			while(true) {
				System.out.println("Escolha a dificuldade 1,2 ou 3:");
				int opcao = teclado.nextInt();
				teclado.nextLine();
				if(opcao == 1) {
					comp = new ComputadorA(); // Dificuldade = f�cil, apenas movimentos v�lidos aleat�rios
					break;
				} else if (opcao == 2) {
					comp = new ComputadorB(); // Dificuldade = m�dia, apenas movimentos v�lidos aleat�rios ou defender
					break;
				} else if (opcao == 3) { // Dificuldade = dif�cil, tenta ganhar ou defender
					comp = new ComputadorC();
					break;
				} else {
					System.out.println("Dificuldade inv�lida. Escolha um valor de 1 a 3!");
				}
			}
		} catch (JogoException e) {
			System.out.println(e.getMessage());
		}
		/*
		 * as jogas poss�veis s�o impressas para facilitar para o jogador
		 * entender que deve escolher os n�meros de 1 a 9 para as jogadas
		 */
		System.out.println("Jogadas poss�veis:\n1 2 3\n4 5 6\n7 8 9");
	
		while(tab.situacao() == false) {
			jogador.jogar();
			if (tab.situacao()){
				break;
			};
			tab.visualizar();
			comp.jogar(Tabuleiro.tab);
			if (tab.situacao()){
				break;
			};
			tab.visualizar();
		}

		//Verificar a situacao e imprimir mensagem adequada informando quem venceu ou se empatou
		teclado.close();

	}

}
