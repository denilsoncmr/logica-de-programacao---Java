import java.util.Scanner;
public class TrocaEmVetorI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[8];
        int aux;

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = input.nextInt();
        }
        for(int i = 0; i < vetor.length/2; i++){
            if((vetor[i]) != (vetor[vetor.length - i - 1])){
                aux = vetor[i];
                vetor[i] = vetor[vetor.length - i - 1];
                vetor[vetor.length - i - 1] = aux;
            }
        }
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
    }
}
