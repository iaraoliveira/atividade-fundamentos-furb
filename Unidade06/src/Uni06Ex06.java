import java.util.Scanner;

public class Uni06Ex06 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de valores a serem cadastrados: ");
        int n = t.nextInt();

        double[] vetor = new double[n];
        lerVetor(t, vetor);

        System.out.print("Informe um valor real a ser verificado: ");
        double valor = t.nextDouble();

        boolean encontrado = encontrarValor(vetor, valor);

        if (encontrado) {
            System.out.println("O valor " + valor + " está cadastrado no vetor.");
        } else {
            System.out.println("O valor " + valor + " não está cadastrado no vetor.");
        }
        
        t.close();
    }

    private static void lerVetor(Scanner t, double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o valor " + (i + 1) + ": ");
            vetor[i] = t.nextDouble();
        }
    }

    private static boolean encontrarValor(double[] vetor, double valor) {
        for (double elemento : vetor) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }
}
