import java.util.Scanner;

public class PositivosEMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number, soma = 0; 
        int contaPositivos = 0; 

        for(int i = 0; i < 6; i++){
            number = input.nextFloat();
            if (number > 0){
                contaPositivos++;
                soma += number;
            }
        }
        System.out.printf("%d valores positivos\n", contaPositivos);
        System.out.printf("%.1f\n", (soma/contaPositivos));

    }
}
