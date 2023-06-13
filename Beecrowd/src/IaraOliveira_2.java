import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class IaraOliveira_2 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("Defina o tamanho da sequencia de números: ");
        int n = t.nextInt();

        double vetor1[] = leiaN(n, t);
        double vetor2[] = leiaN(n, t);
        double soma[] = somaDoisVetores(vetor1, vetor2);

        double vetorOrdenado[] = ordenaVetor(soma);

        escreveVetor(soma);
        escreveVetor(vetorOrdenado);

        t.close();
    }

    // Lê um vetor com n posições
    static double[] leiaN(int n, Scanner t) {
        
        double vetor[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("digite o "+ (i+1) +" número da sequência:");
            vetor[i] = t.nextDouble();
        }
        
        return vetor;
    
    }

    // Soma dois vetores do tipo double
    static double[] somaDoisVetores(double[] vetor1, double[] vetor2) {

        double soma[] = new double[vetor1.length];
        for (int i = 0; i < soma.length; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        return soma;

    }

    static double[] ordenaVetor(double[] vetor){

        double vetorOrdenado[] = vetor;
        Arrays.sort(vetorOrdenado);

        return vetorOrdenado;
    }

    static void escreveVetor(double[] vetor){

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }
    
    
}
