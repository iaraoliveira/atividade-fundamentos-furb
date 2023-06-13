import java.util.Scanner;

public class Uni06Ex05 {
    private static final int TAMANHO_QUESTIONARIO = 5;

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String[] respostasRapaz = new String[TAMANHO_QUESTIONARIO];
        String[] respostasMoca = new String[TAMANHO_QUESTIONARIO];

        
        System.out.println("Respostas da moça:");
        lerRespostas(t, respostasMoca);
        System.out.println("Respostas do rapaz:");
        lerRespostas(t, respostasRapaz);
        
        int afinidade = calcularAfinidade(respostasRapaz, respostasMoca);

    
        System.out.println("Afinidade: " + afinidade);
        System.out.println(obterMensagemAfinidade(afinidade));

        t.close();
    }

    private static void lerRespostas(Scanner t, String[] respostas) {

        for (int i = 0; i < TAMANHO_QUESTIONARIO; i++) {
            System.out.print("Resposta " + (i + 1) + ": ");
            respostas[i] = t.nextLine().toUpperCase();
        }
    }

    private static int calcularAfinidade(String[] respostasRapaz, String[] respostasMoca) {
        int afinidade = 0;

        for (int i = 0; i < TAMANHO_QUESTIONARIO; i++) {
            String respostaRapaz = respostasRapaz[i];
            String respostaMoca = respostasMoca[i];

            if (respostaRapaz.equals(respostaMoca)) {
                afinidade += 3;
            } else if (respostaRapaz.equals("IND") || respostaMoca.equals("IND")) {
                afinidade += 1;
            } else if (respostaRapaz.equals("SIM") && respostaMoca.equals("NÃO")) {
                afinidade -= 2;
            } else if (respostaRapaz.equals("NÃO") && respostaMoca.equals("SIM")) {
                afinidade -= 2;
            }
        }

        return afinidade;
    }

    private static String obterMensagemAfinidade(int afinidade) {
        if (afinidade == 15) {
            return "Casem!";
        } else if (afinidade >= 10 && afinidade <= 14) {
            return "Vocês têm muita coisa em comum!";
        } else if (afinidade >= 5 && afinidade <= 9) {
            return "Talvez não dê certo :(";
        } else if (afinidade >= 0 && afinidade <= 4) {
            return "Vale um encontro.";
        } else if (afinidade >= -9 && afinidade <= -1) {
            return "Melhor não perder tempo";
        } else if (afinidade == -10) {
            return "Vocês se odeiam!";
        } else {
            return "Afinidade desconhecida.";
        }
    }
}
