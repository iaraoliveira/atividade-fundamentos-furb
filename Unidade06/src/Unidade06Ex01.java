import java.util.Scanner;

public class Unidade06Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);

        int numeros[] = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            numeros[i] = t.nextInt();
        }

        for (int i = numeros.length; i >= 0; --i)
            System.out.println(numeros[i-1]);

        t.close();
        
    }
}
