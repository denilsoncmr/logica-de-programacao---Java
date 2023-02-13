import java.util.Scanner;

public class MaiorEPosicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, maior = -1, posicao = -1;
        
        for(int i = 1; i <= 10; i++){
            valor = input.nextInt();
            if (valor > maior){
                maior = valor;
                posicao = i;
            }
        }
        System.out.printf("%d\n%d\n", maior, posicao);
    }
}
