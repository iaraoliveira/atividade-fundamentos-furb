import java.util.Scanner;

public class Uni06Ex01 {
    // Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever.
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);

        int numeros[] = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            numeros[i] = t.nextInt();
        }

        for (int i = numeros.length; i >= 0; --i)
            System.out.println(numeros[i-1]);

        t.close();
        
    }
}
