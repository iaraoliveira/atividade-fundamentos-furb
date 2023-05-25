import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String[] info = new String[3];

        info = teclado.nextLine().split(" ");

        int a = Integer.parseInt(info[0]);
        int b = Integer.parseInt(info[1]);
        int c = Integer.parseInt(info[2]);
        int d = Integer.parseInt(info[3]);

        if (b > c && d > a && ((c + d) > (a + b)) && d >= 0 && a >= 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        teclado.close();
    }
}
