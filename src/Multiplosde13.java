import java.util.Scanner;

public class Multiplosde13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, soma = 0;

        x = input.nextInt();
        y = input.nextInt();

        if(x > y){
            for(int i = y; i <= x; i++){
                if (i % 13 == 0 || 13 % i == 0){
                    continue;
                }else{
                    soma += i;
                }
            }
        }else{
            for(int i = x; i <= y; i++){
                if (i % 13 == 0 || 13 % i == 0){
                    continue;
                } else{
                    soma += i;
                }
            }
        }
        System.out.println(soma);
    }
}
