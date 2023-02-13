import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        int contador = 0;

        while (contador != 6){
            if(valor % 2 != 0){
                System.out.println(valor);
                contador++;
                valor++;
            } else{
                valor++;
            }
        }
    }
}
