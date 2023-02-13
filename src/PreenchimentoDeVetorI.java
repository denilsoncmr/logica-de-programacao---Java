import java.util.Scanner;

public class PreenchimentoDeVetorI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int number = input.nextInt();
        vetor[0] = number;
        for(int i = 1; i < 10; i++){
            vetor[i] = vetor[i-1]*2;
        }
        for(int i = 0; i < 10; i++){
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
    }
}
