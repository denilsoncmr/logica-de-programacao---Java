import java.util.Scanner;

public class FibonacciFacil {
    
    public static int Fibonacci(int arg){
        if(arg == 0){
            return 0;
        }else if( arg == 1){
            return 1;
        }else{
            return (Fibonacci(arg - 1) + Fibonacci(arg - 2));
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int aux = 0; aux < number; aux++){
            if(aux == (number - 1)){
                System.out.println(Fibonacci(aux));
            }else{
                System.out.print(Fibonacci(aux)+ " ");
            }
        }
    }
}
