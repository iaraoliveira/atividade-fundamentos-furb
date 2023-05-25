import java.util.Arrays;
import java.util.Scanner;

public class Uni05Ex05 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("Defina quantos termos a sequencia terá: ");
            n = teclado.nextInt();
        } while (n <= 2);

        int termo = 0;
        int sequencia[] = new int[n];

        for (int i = 1; i <= n; i++) {
            
            if ( i == 1 ) {
                termo = 8;
            } else if ( i % 2 == 0 ) {
                termo = termo * 2;
            } else {
                termo += 2;
            }

            sequencia[i-1] = termo;
        }

        System.out.println(Arrays.toString(sequencia));
    }
}
