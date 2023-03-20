import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Ex06 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        // Entrada
        System.out.println("Informe oo cód de funcionário: ");
        int codFuncionario = teclado.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas pelo funcionário: "); 
        double horasTrabalhadas = teclado.nextDouble();
        System.out.println("Informe o sálario recebido por hora pelo funcionário: ");
        double valorHora = teclado.nextDouble();

        // Processamento
        double calculoSalario = (horasTrabalhadas * valorHora);

        // Saída
        System.out.println("Código do Funcionário: " + codFuncionario);
        System.out.println("Salário a receber: " + df_2.format(calculoSalario));

        teclado.close();
    }
}
