import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int var1, var2, var3, var4, diferenca;
        var1 = teclado.nextInt();
        var2 = teclado.nextInt();
        var3 = teclado.nextInt();
        var4 = teclado.nextInt();
        diferenca = (var1*var2) - (var3*var4);
        System.out.println("DIFERENCA = " + diferenca);
    }
}
