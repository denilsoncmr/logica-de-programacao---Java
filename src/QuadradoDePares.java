import java.util.Scanner;

public class QuadradoDePares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 2; i <= num; i++){
            if (i % 2 == 0){
                System.out.printf("%d^2 = %d\n", i, i*i);
            }
        }

    }
}
