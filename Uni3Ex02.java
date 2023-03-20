import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Ex02 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // entradas
        System.out.print("Informe o valor do par de sapatos: ");
        double preco = teclado.nextDouble();

        // processo
        double valorDesconto = preco * 12 / 100;
        double precoFinal = preco - valorDesconto;

        // saída
        System.out.println("O valor do desconto é: " + valorDesconto);
        System.out.println("O valor do calçado com desconto aplicado é: " + df_2.format(precoFinal));

        teclado.close();
    }
}

