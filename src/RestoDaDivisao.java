import java.util.Scanner;

public class RestoDaDivisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(), y = input.nextInt();
        
        if (x >= y){
            for(int i = y+1; i <= x; i++){
                if (i % 5 == 2 || i % 5 == 3){
                    System.out.println(i);
                }
            }
        } else {
            for(int i = x+1; i <= y; i++){
                if (i % 5 == 2 || i % 5 == 3){
                    System.out.println(i);
                }
            }
        }
    }
}
