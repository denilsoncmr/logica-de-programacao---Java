import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, quantidade;
        boolean chave = true;
        quantidade = input.nextInt();
        for(int j = 0; j < quantidade; j++){
            number = input.nextInt();
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    chave = false;
                    break;
                }
            }
            if(chave){
                System.out.println(number + " eh primo");
            }else{
                System.out.println(number + " nao eh primo");
            }
            chave = true;
        }
    }
    
}
