import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = 1; i <=10; i++){
            System.out.printf("%d x %d = %d\n", i, num, (i*num));
        }
    }
}
