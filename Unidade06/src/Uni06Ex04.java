import java.util.Scanner;

public class Uni06Ex04 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];

        lerVetor(vetor1, t);
        lerVetor(vetor2, t);

        int soma[] = somarVetor(vetor1, vetor2);
        imprimirVetor(vetor1, "vetor1");
        imprimirVetor(vetor2, "vetor2");
        imprimirVetor(soma, "soma");
    }

    static void lerVetor(int vetor[], Scanner t) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + " número: ");
            vetor[i] = t.nextInt();
        }
    }

    static int[] somarVetor(int vetor1[], int vetor2[]) {
        int soma[] = new int[vetor1.length];

        for (int i = 0; i < soma.length; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        return soma;
    }

    static void imprimirVetor(int vetor[], String nomeVetor) {
        System.out.print(nomeVetor + ": ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.println("");
    }

}
