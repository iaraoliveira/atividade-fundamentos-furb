import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Ex03 {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       DecimalFormat df_4 = new DecimalFormat( "0.0000");

        //    Entrada
        double pi = 3.14159;
        System.out.println("Digite o raio: ");
        double raio = teclado.nextDouble();

        // Processo
        double area = pi * raio * raio;

        // Saida
        System.out.println("A= " + df_4.format(area));
        teclado.close();

    }
}
