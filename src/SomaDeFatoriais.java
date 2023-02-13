import java.util.Scanner;

public class SomaDeFatoriais {
    public static long Fatorial(int arg) {
        if (arg == 0 || arg == 1) {
            return 1;
        } else {
            return arg * Fatorial(arg - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int number = input.nextInt();
            int number2 = input.nextInt();
            System.out.println(Fatorial(number) + Fatorial(number2));
        }
    }
}
