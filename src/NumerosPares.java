import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        int interador = 1;
        while (interador <= 100){
            if (interador % 2 == 0){
                System.out.println(interador);
            }
            interador += 1;
        }   
    }
}
