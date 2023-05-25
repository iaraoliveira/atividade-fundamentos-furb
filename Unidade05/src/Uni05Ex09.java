import java.util.Scanner;

public class Uni05Ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos: ");
        int n = teclado.nextInt();
        int qtdIdadeMaior20 = 0;
        String nomeAlunos18 = "";

        for (int i = 1; i <= n; i++) {
            System.out.println("Escreva o nome do aluno " + i + " :");
            String nome = teclado.next();

            System.out.println("Escreva a idade do aluno " + i + " :");
            int idade = teclado.nextInt();

            if ( idade == 18 ) {
                nomeAlunos18 = nome + ", ";
            }

            if ( idade >= 20 ) {
                qtdIdadeMaior20 ++;
            }
        }

        System.out.println("Os alunos que tem 18 anos são: " + nomeAlunos18);
        System.out.println("A quantidade de alunos cuja idade é maior que 20 é: " + qtdIdadeMaior20);
        teclado.close();
    }
}
