import java.util.Scanner;

public class Uni05Ex03 {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double soma  = 0;

        for (int i = 1; i <= 100; i++) {
            soma += (double) 1 / i;
        }

        System.out.println("A soma dos termos é: " + soma);


        teclado.close();
    }
}
