import java.util.Scanner;

public class Uni05Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mercadorias = 20;
        String nome;
        double precoCompra = 0, precoVenda = 0;

        for (int i = 1; i <= mercadorias; i++) {

            System.out.println("Digite o nome da mercadoria " + i + ":");
            nome = teclado.next();
            System.out.println("Digite o preço de compra da mercadoria " + i + ":");
            precoCompra = teclado.nextInt(); 
            System.out.println("Digite o preço de venda da mercadoria " + i + ":");
            precoVenda  = teclado.nextInt(); 

            double percentualLucro = (precoVenda - precoCompra) / precoCompra * 100;

            if ( percentualLucro < 10 ){

            }else if ( 10 <= percentualLucro && percentualLucro <= 20){

            }else{

            }
        }

        teclado.close();
    }
}
