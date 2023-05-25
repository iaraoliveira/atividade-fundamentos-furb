import java.util.Scanner;

public class Uni05Ex07 {
    public static void main(String[] args) {
        //IMCOMPLETO
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

            if (numero > numAnterior) {
                maiorNumero = numero;
            }
            else if (numero < numAnterior) {
                menorNumero = numero;
            }
        }

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor número é: " + menorNumero);
    }
}
