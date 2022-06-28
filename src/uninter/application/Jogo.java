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
	// foram criados pacotes diferentes: um para a aplicação e outro para as classesdos objetos (entidades) que serão utilizados
	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		Tabuleiro tab = new Tabuleiro();
		ComputadorA comp = new ComputadorA();

		// este teclado servirá apenas para a escolha da dificuldade, quando o jogador realizar a jogada, existirá um scanner próprio do Jogador
		Scanner teclado = new Scanner(System.in);
		System.out.println("Jogo da velha");
		System.out.println("Dificuldades:\n1 = Fácil\n2 = Média\n3 = Difícil");
		try {
			while(true) {
				System.out.println("Escolha a dificuldade 1,2 ou 3:");
				int opcao = teclado.nextInt();
				teclado.nextLine();
				if(opcao == 1) {
					comp = new ComputadorA(); // Dificuldade = fácil, apenas movimentos válidos aleatórios
					break;
				} else if (opcao == 2) {
					comp = new ComputadorB(); // Dificuldade = média, apenas movimentos válidos aleatórios ou defender
					break;
				} else if (opcao == 3) { // Dificuldade = difícil, tenta ganhar ou defender
					comp = new ComputadorC();
					break;
				} else {
					System.out.println("Dificuldade inválida. Escolha um valor de 1 a 3!");
				}
			}
		} catch (JogoException e) {
			System.out.println(e.getMessage());
		}
		/*
		 * as jogas possíveis são impressas para facilitar para o jogador
		 * entender que deve escolher os números de 1 a 9 para as jogadas
		 */
		System.out.println("Jogadas possíveis:\n1 2 3\n4 5 6\n7 8 9");
	
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
