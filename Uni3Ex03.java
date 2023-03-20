import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // entrada
        System.out.println("Informe o preço do litro do combustível: ");
        double precoLitro = teclado.nextDouble();
        System.out.println("Informe quanto o motorista pagou em seu abastecimento: ");
        double valorPago = teclado.nextDouble();

        // processo
        double qtdLitros = valorPago/precoLitro;

        // saída
        System.out.println("O motorista abasteceu " + df_2.format(qtdLitros) + " litros");

        teclado.close();
    }
}
