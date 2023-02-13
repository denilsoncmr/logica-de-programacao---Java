import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigoUm, codigoDois, quantidadeUm, quantidadeDois;
        double precoUm, precoDois, total;

        codigoUm = teclado.nextInt();
        quantidadeUm = teclado.nextInt();
        precoUm = teclado.nextDouble();

        codigoDois = teclado.nextInt();
        quantidadeDois = teclado.nextInt();
        precoDois = teclado.nextDouble();

        total = (quantidadeUm*precoUm)+(quantidadeDois*precoDois);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
    }
}
