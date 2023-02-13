import java.util.Scanner;

public class SequenciasCrescentes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = -1;
        while (number != 0) {
            number = input.nextInt();
            for (int aux = 1; aux <= number; aux++) {
                if (aux == number) {
                    System.out.println(aux);
                } else {
                    System.out.print(aux + " ");
                }
            }
        }
    }
}
