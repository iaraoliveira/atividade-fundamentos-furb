import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // double cotacaoDolar = 5.16;
        // entrada
        System.out.println("Digite a cotação do dolar hoje: ");
        double cotacaoDolar = teclado.nextDouble();
        System.out.println("Digite a quantidade de dolares: ");
        double qtdDolares = teclado.nextDouble();
        
        // processo
        double reais = cotacaoDolar * qtdDolares;

        // saida
        System.out.println("O valor a ser recebido é: " + df_2.format(reais));
        teclado.close();
    }
}
