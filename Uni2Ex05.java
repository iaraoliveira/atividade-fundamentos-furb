import java.util.Scanner;

public class Uni2Ex05 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            
            // Entrada
            System.out.println("Digite o valor de A: ");
            double a = teclado.nextDouble();

            System.out.println("Digite o valor de B: ");
            double b = teclado.nextDouble();
            
            System.out.println("Digite o valor de C: ");
            double c = teclado.nextDouble();
            
            System.out.println("Digite o valor de D: ");
            double d = teclado.nextDouble();

            // Processo
            double diferenca = ((a*b)-(c*d));

            // Saída
            System.out.println("A diferença do produto de A e B com C e D é: " + diferenca);

            teclado.close();

        }
    }