import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // Entrada
        System.out.println("Digite o nome do vendedor");
        String nome = teclado.nextLine();
        System.out.println("Digite o salário fixo deste vendedor");
        double salFixo = teclado.nextDouble();
        System.out.println("Qual o total de vendas realizada pelo vendedor?");
        int vendas = teclado.nextInt();

        // Processo
        double comissao = vendas * 15 / 100;
        double areceber = salFixo + comissao; 

        // Saida
        System.out.println("O valor a ser recebido por " + nome + " é: " + df_2.format(areceber));

        teclado.close();
    }
}
