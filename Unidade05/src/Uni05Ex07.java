import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni05Ex07 {
    public static void main(String[] args) {
        DecimalFormat df_0 = new DecimalFormat("0");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int n = teclado.nextInt();
        double numero = 0;
        double numAnterior = 0;
        double maiorNumero = 0;
        double menorNumero = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o " + i + " número real");
            numero = teclado.nextDouble();
            
            if ( i == 1 ) {
                maiorNumero = numero;
                menorNumero = numero;

            } else {
                if (numero >= numAnterior) {
                    maiorNumero = numero;
                }

                else if (numero <= numAnterior) {
                    menorNumero = numero;
                }
            }
        }

        System.out.println("O maior número é: " + df_0.format(maiorNumero));
        System.out.println("O menor número é: " + df_0.format(menorNumero));
        teclado.close();

    }
}
