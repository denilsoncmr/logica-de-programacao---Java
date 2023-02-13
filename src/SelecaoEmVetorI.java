import java.util.Scanner;

public class SelecaoEmVetorI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] vetor = new float[100];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = input.nextFloat();
        }
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] <= 10){
                System.out.printf("A[%d] = %.1f\n", i, vetor[i]);
            }
        }
    }
}
