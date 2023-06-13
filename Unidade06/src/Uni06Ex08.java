import java.util.Scanner;

public class Uni06Ex08 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int tamanhoVetor;

        do {
            System.out.println("Informe a quantidade de números que deseja solicitar:");
            tamanhoVetor = t.nextInt();
        } while (tamanhoVetor < 1 || tamanhoVetor > 20);

        double vetor[] = new double[tamanhoVetor];
        lerVetor(t, vetor);
        imprimirVetor(vetor);
        imprimirFrequencia(vetor);

        t.close();
    }

    static void lerVetor(Scanner t, double vetor[]){
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Informe o "+(i+1)+" valor real:");
            vetor[i] = t.nextDouble(); 
        }
    }

    static void imprimirVetor(double vetor[]){
        for (int i = 0; i < vetor.length; i++){
          System.out.print("["+vetor[i]+"]");  
        }
    }

    static void imprimirFrequencia(double vetor[]){
        int contador = 0;
        boolean encontrou[] = new boolean[vetor.length];

        System.out.println();
        System.out.println("VALOR  |  FREQUENCIA");
        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length; j++){
                if (!encontrou[j]){
                    if (vetor[i] == vetor[j]){
                        contador++;
                        encontrou[j] = true;
                    }
                }
            }

            if (contador > 0){
              System.out.println(vetor[i]+" | "+contador);
              contador = 0;
            }

        }
    }
}
