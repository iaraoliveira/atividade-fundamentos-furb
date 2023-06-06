import java.util.Scanner;

public class Uni06Ex03 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double numeros[] = new double[12];

        lerNumeros(t, numeros);
        ajustarValores(numeros);
        escreverValores(numeros);
        
    }

    static double[] lerNumeros(Scanner t, double[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            numeros[i] = t.nextDouble();
        }

        return numeros;
    }
    
    static double[] ajustarValores(double[] numeros) {
        
        return numeros;
    }


    static void escreverValores(double[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

}
