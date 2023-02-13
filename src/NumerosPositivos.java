import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number; 
        int contaPositivos = 0; 

        for(int i = 0; i < 6; i++){
            number = input.nextFloat();
            if (number > 0){
                contaPositivos++;
            }
        }
        System.out.printf("%d valores positivos", contaPositivos);
    }
}
