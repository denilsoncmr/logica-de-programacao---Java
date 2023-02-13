import java.util.Scanner;

public class IV_ProdutoSimples {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int var1, var2, produto;
        var1 = teclado.nextInt();
        var2 = teclado.nextInt();
        produto = var1 * var2;
        System.out.println("PROD = " + produto);
    }
}
