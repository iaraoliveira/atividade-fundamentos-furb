import java.util.Scanner;

public class Liga4 {
	public static void main(String[] args) {
		new Liga4();
	}

	// construtor
	private Liga4() {
		Scanner teclado = new Scanner(System.in);
		char[][] tabuleiro = new char[6][7];
				
		char jogador = selecionarCorJogador(teclado);
		char computador = selecionarCorComputador(jogador);

		char op;

		do {
			iniciarJogo(tabuleiro, teclado, jogador, computador);
			
            System.out.println("Deseja Jogar Novamente?");
            System.out.println("S - Sim");
            System.out.println("N - Não");
            op = teclado.next().charAt(0);
            op = Character.toUpperCase(op);
			
		} while (op != 'N');


		teclado.close();
	}

	/* Pergunta ao usuário qual cor ele gostaria de utilizar durante suas jogadas */
	private static char selecionarCorJogador(Scanner t){
		char jogador;
		boolean corValida = true;

		System.out.println("Escolha com qual cor você gostaria de jogar: ");
		do {
			corValida = true;

			System.out.println("V - Vermelho: ");
			System.out.println("A - Azul");
			
			jogador = t.next().charAt(0);
			jogador = Character.toUpperCase(jogador);
			
			if (!Character.isLetter(jogador) || (jogador != 'V' && jogador != 'A')) {
				System.out.println("A letra selecionada não é válida.");
				System.out.println("Informe sua escolha novamente:");
				corValida = false;
			}
		} while (!corValida);

		return jogador;
	}

	/* Define a cor do computador com base na cor do usuário jogador*/
	private static char selecionarCorComputador(char jogador){
		if (jogador == 'V')
			return 'A';
		return 'V';
			
	}
	
	/* Recebe uma matriz de tabuleiro recém criada e a inicializa para conter todas as posições necessárias */
	private static void inicializaTabuleiro(char[][] tabuleiro){
		for (int linha = 0; linha < tabuleiro.length; linha++){
			for (int col = 0; col < tabuleiro[0].length; col++){
				tabuleiro[linha][col] = 'B';
			}
		}
	}

	private static void iniciarJogo(char tabuleiro[][], Scanner teclado, char jogador, char computador) {
		int rodada = 0;
		boolean vencedor = false;		

		inicializaTabuleiro(tabuleiro);

        int jogadorDaVez = jogador;

		//jogar uma rodada
		while (vencedor == false && rodada < 42){
			rodada++;
			displayTabuleiro(tabuleiro);

			if(jogadorDaVez == jogador){
				//rodadaUsuario
				vencedor = jogadaUsuario(teclado, tabuleiro, jogador);
				
				//altera jogador da vez para o computador
				jogadorDaVez = computador;
			} else {
				//rodadaComputador
				vencedor = jogadaComputador(tabuleiro, computador);

				//altera jogador da vez para o usuario
				jogadorDaVez = jogador;
			}
					
			if (vencedor){
				displayTabuleiro(tabuleiro);
				// System.out.println("____________________________________");
				System.out.println("===============================================");

				if (jogadorDaVez=='V'){
					System.out.println("Jogador Azul ganhou!");
				}else{
					System.out.println("Jogador Vermelho ganhou!");
				}
				
			}

		}
		System.out.println("===============================================");

	}

	/* mostra tabuleiro em tela */
	private static void displayTabuleiro(char[][] tabuleiro){
		System.out.println("  0  1  2  3  4  5  6  ");
		System.out.println("-----------------------");
		for (int linha = 0; linha < tabuleiro.length; linha++){
			System.out.print("  ");
			for (int col = 0; col < tabuleiro[0].length; col++){
				System.out.print(tabuleiro[linha][col]);
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		System.out.println("  0  1  2  3  4  5  6  ");
		System.out.println();
	}
	
    private static boolean jogadaUsuario(Scanner t, char tabuleiro[][], char jogador) {
		boolean jogadaValida;
		int jogada;

		do {
			System.out.println("Escolha uma coluna para jogar: ");
			jogada = t.nextInt();
			
			//validarJogada
			jogadaValida = validarJogada(jogada,tabuleiro);
		} while (jogadaValida == false);

		for (int linha = tabuleiro.length-1; linha >= 0; linha--){
			if(tabuleiro[linha][jogada] == 'B'){
				tabuleiro[linha][jogada] = jogador;
				break;
			}
		}
		return isVencedor(jogador,tabuleiro);

	}

    private static boolean jogadaComputador(char tabuleiro[][], char computador) {
		boolean jogadaValida;
		int jogada;

		do {
			System.out.println("Computador Jogando...");
			System.out.println(" ");
			
			jogada = sortear(-1, 7);
			
			//validarJogada
			jogadaValida = validarJogada(jogada,tabuleiro);
		} while (jogadaValida == false);

		for (int linha = tabuleiro.length-1; linha >= 0; linha--){
			if(tabuleiro[linha][jogada] == 'B'){
				tabuleiro[linha][jogada] = computador;
				break;
			}
		}
		return isVencedor(computador,tabuleiro);

	}

	private static boolean isVencedor(char jogador, char[][] tabuleiro){
		//verifica se há 4 seguidos em uma coluna
		for(int linha = 0; linha<tabuleiro.length; linha++){
			for (int col = 0;col < tabuleiro[0].length - 3;col++){
				if (tabuleiro[linha][col] == jogador   && 
					tabuleiro[linha][col+1] == jogador &&
					tabuleiro[linha][col+2] == jogador &&
					tabuleiro[linha][col+3] == jogador){
					return true;
				}
			}			
		}
		//verifica se há 4 seguidos em uma linha
		for(int linha = 0; linha < tabuleiro.length - 3; linha++){
			for(int col = 0; col < tabuleiro[0].length; col++){
				if (tabuleiro[linha][col] == jogador   && 
					tabuleiro[linha+1][col] == jogador &&
					tabuleiro[linha+2][col] == jogador &&
					tabuleiro[linha+3][col] == jogador){
					return true;
				}
			}
		}
		//verifica se há 4 seguidos em uma diagonal crescente
		for(int linha = 3; linha < tabuleiro.length; linha++){
			for(int col = 0; col < tabuleiro[0].length - 3; col++){
				if (tabuleiro[linha][col] == jogador   && 
					tabuleiro[linha-1][col+1] == jogador &&
					tabuleiro[linha-2][col+2] == jogador &&
					tabuleiro[linha-3][col+3] == jogador){
					return true;
				}
			}
		}
		//verifica se há 4 seguidos em uma diagonal descrescente
		for(int linha = 0; linha < tabuleiro.length - 3; linha++){
			for(int col = 0; col < tabuleiro[0].length - 3; col++){
				if (tabuleiro[linha][col] == jogador   && 
					tabuleiro[linha+1][col+1] == jogador &&
					tabuleiro[linha+2][col+2] == jogador &&
					tabuleiro[linha+3][col+3] == jogador){
					return true;
				}
			}
		}
		return false;
	}


	private static boolean validarJogada(int column, char[][] tabuleiro){
		//a coluna selecionada é valida?
		if (column < 0 || column > tabuleiro[0].length){
			System.out.println("A coluna selecionada não existe.");
			return false;
		}
		
		//a coluna já está cheia?
		if (tabuleiro[0][column] != 'B'){
			System.out.println("A coluna selecionada já está cheia.");
			return false;
		}
		
		return true;
	}

	 /* Sorteia um número aleatório, a partir do math.random efetua um calculo a partir dos numeros definidos
    na variavel fim e inicio*/
    public static int sortear(int inicio, int fim) {
        return (int) ((Math.random() * (fim - inicio)) + inicio);
    }
	
}