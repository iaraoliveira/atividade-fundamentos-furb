// import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // DecimalFormat df_4 = new DecimalFormat("0.0000");
        Scanner teclado = new Scanner(System.in);

        String[] valores = new String[3];
        
        valores = teclado.nextLine().split(" ");
        
        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);
        int d = Integer.parseInt(valores[3]);

        if (b > c && d > a && (c + d) > (a + b)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
        
        teclado.close();
    }
}