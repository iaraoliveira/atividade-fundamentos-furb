import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni05Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");

        System.out.println("Informe a quantidade de paradas: ");
        int paradas = 0;

        double km = 0;
        double kmPorLitro = 0;
        double mediaKm = 0;
        double somaKm = 0;

        for (int i = 1; i <= paradas; i++) {
            System.out.println("Informe a KM: ");
            km = teclado.nextDouble();
            somaKm += km;
            
            System.out.println("Informe");
        }

        teclado.close();
    }
}
