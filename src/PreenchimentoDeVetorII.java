import java.util.Scanner;

public class PreenchimentoDeVetorII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int number = input.nextInt(), z = 0;
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = z;
            if(z == number-1){
                z = -1;
            }
            z++;
        }
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }
    }
}
