import java.util.Scanner;

public class PreenchimentoDeVetorIII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vetor = new double[100];
        double number = input.nextDouble();
        vetor[0] = number;
        for(int i = 1; i < vetor.length; i++){
            vetor[i] = vetor[i-1]/2.0;
        }
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("N[%d] = %.4f\n", i, vetor[i]);
        }
    }
}
