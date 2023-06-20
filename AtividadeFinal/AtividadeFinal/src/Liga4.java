import java.util.Scanner;

public class Liga4 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		char[][] tabuleiro = new char[6][7];
		
		//inicializa tabuleiro
		for (int linha = 0; linha < tabuleiro.length; linha++){
			for (int col = 0; col < tabuleiro[0].length; col++){
				tabuleiro[linha][col] = 'B';
			}
		}
		
		//seleciona cor
		System.out.println("Escolha com qual cor você gostaria de jogar: ");
		System.out.println("V - Vermelho: ");
		System.out.println("A - Azul");
		// char corEscolhida = t.next().toUpperCase().charAt(0);
		char jogador = t.next().toUpperCase().charAt(0);

		////validar a cor escolhida/////

		int rodada = 1;
		boolean vencedor = false;		
		
		//jogar uma rodada
		while (vencedor == false && rodada <= 42){
			boolean jogadaValida;
			int jogada;
			do {
				carregaTabuleiro(tabuleiro);
				
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
			
			//existe um vencedor?
			vencedor = isVencedor(jogador,tabuleiro);
			
			//troca jogador
			if (jogador == 'V'){
				jogador = 'A';
			}else{
				jogador = 'V';
			}
			
			rodada++;			
		}
		carregaTabuleiro(tabuleiro);
		
		if (vencedor){
			if (jogador=='V'){
				System.out.println("Jogador Azul ganhou");
			}else{
				System.out.println("Jogador Vermelho ganhou");
			}
		}else{
			System.out.println("Empate");
		}
		
		t.close();
	}
	
	public static void carregaTabuleiro(char[][] tabuleiro){
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
	
	public static boolean validarJogada(int column, char[][] tabuleiro){
		//a coluna selecionada é valida?
		if (column < 0 || column > tabuleiro[0].length){
			return false;
		}
		
		//a coluna já está cheia?
		if (tabuleiro[0][column] != 'B'){
			return false;
		}
		
		return true;
	}
	
	public static boolean isVencedor(char jogador, char[][] tabuleiro){
		//check for 4 across
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
		//check for 4 up and down
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
		//check upward diagonal
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
		//check downward diagonal
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

}