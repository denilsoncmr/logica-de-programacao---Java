import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class QuadradaEAoCubo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.printf("%d %d %d\n", i, (i*i), (i*i*i));
        }
    }
}
