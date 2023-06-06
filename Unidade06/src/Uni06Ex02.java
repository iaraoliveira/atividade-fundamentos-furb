import java.util.Scanner;

public class Uni06Ex02 {
    // Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Imprima quais valores desses informados são maiores que a média dos valores. Faça um método para ler os valores, outro para calcular a média e outro para informar os valores maiores que a média.
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double media = 0;
        double numeros[] = new double[12];

        lerNumeros(t, numeros);
        media = calcularMedia(numeros);
        mostrarNumerosMaiorQueMedia(media, numeros);

        t.close();
    }

    static double[] lerNumeros(Scanner t, double[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            numeros[i] = t.nextDouble();
        }

        return numeros;
    }


    static double calcularMedia(double[] numeros){
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return soma/12;
    }

    static void mostrarNumerosMaiorQueMedia(double media, double[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }    
        }

    }
    
}
