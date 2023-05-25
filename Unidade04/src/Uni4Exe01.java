import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Quantidade de horas trabalhas por mês: ");
        double qtdHorasMes = teclado.nextInt();
        System.out.println("Valor por hora: ");
        double valorHora = teclado.nextInt();

        double qtdHorasSemana = qtdHorasMes / 4;
        
        double valorTotalMes =  qtdHorasMes * valorHora;
        
        if ( qtdHorasSemana > 40 ) {
            double horasExtras = qtdHorasSemana - 40;
            valorTotalMes += (horasExtras/2) * valorHora;
        }

        System.out.println("Pagamento mensal: " + valorTotalMes);

        teclado.close();

    }
}
