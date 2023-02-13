import java.util.Scanner;

public class SubstituicaoEmVetorI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[3];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = input.nextInt();
            if(vetor[i] <= 0){
                vetor[i] = 1;
            }
        }
        
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("X[%d] = %d\n", i, vetor[i]);
        }
    }
}
