import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni05Ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        double altura = 0;
        double soma = 0;

        for (int i = 1; i <= 20; i++) {
                System.out.println("digite a altura da pessoa " + i);
                altura = teclado.nextDouble();
                soma += altura;
       }

        double media = soma / 20;
        System.out.println(df_2.format(media));

        teclado.close();

    }
}
