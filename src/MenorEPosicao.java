import java.util.Scanner;

public class MenorEPosicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(), menor = 10000000, posicao = -1;
        int[] vetor = new int[number];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = input.nextInt();
        }
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
                posicao = i;
            }
        }
        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Posicao: %d\n", posicao);
    }
}
