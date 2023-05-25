import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni05Ex08 {
    public static void main(String[] args) {
        DecimalFormat df_0 = new DecimalFormat("0");
        DecimalFormat df_2 = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int n = teclado.nextInt();
        double numero = 0;
        double numAnterior = 0;
        double menorNumero = 0;
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o " + i + " número real");
            numero = teclado.nextDouble();
            
            if ( i == 1 ) {
                menorNumero = numero;
            } else {

                if (numero < 0 && numero < numAnterior) {
                    menorNumero = numero;
                } else if (numero > 0) {
                    soma += numero;
                }
                
            }
        }

        double media = soma / n;

        System.out.println("O menor número negativo é: " + df_0.format(menorNumero));
        System.out.println("A média dos número positivos é: " + df_2.format(media));
        teclado.close();

    }
}
