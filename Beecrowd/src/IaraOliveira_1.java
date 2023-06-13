import java.text.DecimalFormat;
import java.util.Scanner;

public class IaraOliveira_1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");

        int voto = 0;

        int votosChapa1 = 0, votosChapa2 = 0, votosNulos = 0, votosTotal = 0;

        System.out.println("1 = voto para a Chapa 1");
        System.out.println("2 = voto para a Chapa 2");
        System.out.println("3 = voto nulo");
        System.out.println("9 = encerrar a votação");
        System.out.println("-----");

        do {
            System.out.println("Digite o código da chapa escolhida:");

            voto = t.nextInt();

            switch (voto) {
                case 1:
                    votosChapa1++;
                    votosTotal++;
                    break;
                case 2:
                    votosChapa2++;
                    votosTotal++;
                    break;
                case 3:
                    votosNulos++;
                    votosTotal++;
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }
        } while (voto != 9);

        double percentualChapa1 = (votosChapa1*100)/votosTotal;
        double percentualChapa2 = (votosChapa2*100)/votosTotal;
        double percentualNulos = (votosNulos*100)/votosTotal;

        System.out.println("Total de votos para a Chapa 1: "+ votosChapa1);
        System.out.println("Percentual de votos para a Chapa 1: "+ df.format(percentualChapa1) + "%");
        System.out.println("Total de votos para a Chapa 2: "+ votosChapa2);
        System.out.println("Percentual de votos para a Chapa 2: "+ df.format(percentualChapa2)+ "%");
        System.out.println("Total de votos nulos: "+ votosNulos);
        System.out.println("Percentual de votos nulos: "+ df.format(percentualNulos)+ "%");
        
        if (votosChapa1 > votosChapa2) {
            System.out.println("A chapa vencedora é a chapa 1");
        } else if (votosChapa2 > votosChapa1){
            System.out.println("A chapa vencedora é a chapa 2");
        } else {
            System.out.println("EMPATE NA VOTAÇÃO");
        }


        t.close();
    }
}
