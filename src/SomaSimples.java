import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int var1, var2, soma;
        var1 = teclado.nextInt();
        var2 = teclado.nextInt();
        soma = var1 + var2;
        System.out.println("SOMA = " + soma);
    }
}
