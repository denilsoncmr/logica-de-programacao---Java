import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, soma = 0;
        while (input.hasNext()) {
            number = input.nextInt();
            for(int i = 1; i < number; i++){
                if(number % i == 0){
                    soma += i;
                }
            }
            if(soma == number){
                System.out.println(number + " eh perfeito");
            }else{
                System.out.println(number + " nao eh perfeito");
            }
            soma = 0;
        }
    }
}
