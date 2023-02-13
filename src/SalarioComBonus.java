import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double salarioFixo, valorVendas, novoSalario;

        nome = teclado.nextLine();
        salarioFixo = teclado.nextDouble();
        valorVendas = teclado.nextDouble();
        novoSalario = salarioFixo + (0.15*valorVendas);

        System.out.printf("TOTAL = R$ %.2f", novoSalario);

    }
}
