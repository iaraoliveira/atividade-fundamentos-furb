import java.util.Scanner;

public class Uni05Ex04 {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numerador  = 3;
        int denominador  = 2;
        float soma = 0;

        for (int i = 1; i <= 20; i++) {
            soma += (double) numerador / denominador;

            System.out.println(soma);

            denominador = (denominador + numerador) + 1; 
            numerador = numerador + 2;
        }

        System.out.println("A soma dos termos é: " + soma);


        teclado.close();
    }
}
