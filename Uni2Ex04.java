import java.util.Scanner;

public class Uni2Ex04 {

    // Leia dois valores de ponto flutuante e calcule a média pnderada sabendo que a nota A tem peso 3.5 e a nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = teclado.nextDouble();
        // if (nota1 < 0 || nota1 > 10) {
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("A nota precisa estar entre 1 e 10. Digite novamente: ");
                nota1 = teclado.nextDouble();
            }
        // }

        System.out.println("Digite a nota 2: ");
        double nota2 = teclado.nextDouble();
        // if (nota2 < 0 || nota2 > 10) {
            while (nota2 < 0 || nota2 > 10) {   
                System.out.println("A nota precisa estar ente 1 e 10. Digite novamente: ");
                nota2 = teclado.nextDouble();
            }
        // }

        double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;
        System.out.println("A média calculada é: " + media);
        teclado.close();
    }
}
