import java.util.Scanner;

public class SomaImparesConsecutivosI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, soma = 0;

        a = input.nextInt();
        b = input.nextInt();
        
        if (a > b){
            for(int i = (b+1); i < a; i++){
                if (i % 2 != 0){
                    soma += i;
                }
            }
        } else{
            for(int i = (a+1); i < b; i++){
                if (i % 2 != 0){
                    soma += i;
                }
            }
        }
        System.out.println(soma);
    }
}
