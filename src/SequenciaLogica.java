import java.util.Scanner;

public class SequenciaLogica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.printf("%d %d %d\n", i, (i*i), (i*i*i));
            System.out.printf("%d %d %d\n", i, (i*i+1), (i*i*i+1));
        }
    }
}
