import java.util.Arrays;
import java.util.Scanner;

public class Uni06Ex07 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int tamanhoVetor;
        do{
            System.out.println("Informe a quantidade de números que deseja solicitar:");
            tamanhoVetor = t.nextInt();
        }while(tamanhoVetor < 1 || tamanhoVetor > 20);

        int vetorNumero[] = new int[tamanhoVetor];

        lerNumero(t, vetorNumero);
        imprimirVetor(vetorNumero,"origem");
        ordenarVetor(vetorNumero);
        imprimirVetor(vetorNumero, "ordenado");

        t.close();
    }

    static void lerNumero(Scanner t, int vetor[]){
        int i = 0, numero = 0;
        boolean encontrou;
        while (i < vetor.length){
          System.out.print("Informe o "+(i+1)+" número: ");
          numero = t.nextInt();
          
          encontrou = pesquisarValor(vetor, numero, i);  
  
          if (!encontrou){
              vetor[i] = numero;
              i++;
          }        
          
        }
      }

      static boolean pesquisarValor(int vetor[], int numeroPesquisa, int indiceAtual){

        for (int j = 0; j < indiceAtual; j++){
            if (vetor[j] == numeroPesquisa){
                return true;
            }
        }
        return false;
    }

    static void imprimirVetor(int vetor[], String nomeVetor){
        System.out.println("Vetor "+nomeVetor+": ");
        for (int i = 0; i < vetor.length;i++){ 
            System.out.print("["+vetor[i]+"]");
        }
        System.out.println("");
    }

    static void ordenarVetor(int vetor[]){
        Arrays.sort(vetor); 
     }


}