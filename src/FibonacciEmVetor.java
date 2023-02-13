import java.util.Scanner;

public class FibonacciEmVetor {

    public static int Fibonacci(int arg) {
        if(arg == 0){
            return 0;
        }else if(arg == 1){
            return 1;
        }else{
            return Fibonacci(arg - 1) + Fibonacci(arg - 2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] vetor = new int[64];

        for(int i = 0; i < number; i++){
            vetor[i] = input.nextInt();
        }
        for(int i = 0; i < number; i++){
            System.out.printf("Fib(%d) = %d\n", vetor[i], Fibonacci(vetor[i]));
        } 
    }
}
