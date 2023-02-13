import java.util.Scanner;

public class Resto2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < 10000; i++){
            if (i % num == 2){
                System.out.println(i);
            }
        }
    }
}
