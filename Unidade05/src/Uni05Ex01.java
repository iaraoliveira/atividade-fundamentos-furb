import java.util.Scanner;

public class Uni05Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        for (int i = 1; i <= 20; i++) {
            
            System.out.println("Digite o número " + i);
            numero = teclado.nextInt();

            if ((numero % 2) == 0 ) {
                System.out.println("Numero par");
            } else {
                System.out.println("Numero impar");
            }

        }

        teclado.close();
    }
}

