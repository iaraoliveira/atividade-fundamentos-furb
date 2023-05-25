import java.util.Scanner;

public class Uni05Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 100; i++) {
            
            if ( (i % 2) == 0 ) {
                pares = pares + i;
            } else {
                impares = impares + i;
            }
        }

        System.out.println( "A soma dos números pares é: " + pares);
        System.out.println( "A soma dos números impares é: " + impares);

        teclado.close();
    }
}

