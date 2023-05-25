public class Uni05Ex11 {
    public static void main(String[] args) {
        int biscoitosQuebrados = 0;
        int biscoitosTotal = 0;
        int hora = 1;

        for (int i = 1; i <= 16; i++) {
            if ( i == 1 ) {
                biscoitosQuebrados = 1;
            } else {
                biscoitosQuebrados *= 3;
            }

            biscoitosTotal += biscoitosQuebrados;
            
            System.out.println("hora: " + hora);
            System.out.println("biscoitos: " + biscoitosQuebrados);
            System.out.println("total: " + biscoitosTotal);
            System.out.println("---");

            hora++;
        }

        System.out.println("biscoitos quebrados total: " + biscoitosTotal);
    }
}
