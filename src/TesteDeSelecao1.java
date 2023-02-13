import java.util.Scanner;

public class TesteDeSelecao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        if (a % 2 == 0 && c > 0 && d > 0){
            if (b > c && d > a){
                if ((c+d) > (a+b)){
                    System.out.println("Valores aceitos");
                }
            }
        } else{
            System.out.println("Valores nao aceitos");
        }
    }
}
