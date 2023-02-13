import java.util.Scanner;

public class ParesEntreCincoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number; 
        int contaPares = 0; 

        for(int i = 0; i < 5; i++){
            number = input.nextFloat();
            if (number % 2 == 0){
                contaPares++;
            }
        }
        System.out.printf("%d valores pares\n", contaPares);

    }
}
