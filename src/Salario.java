import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int identificador, horasTrabalhadas;
        double valorHora, salario;
        identificador = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorHora = teclado.nextDouble();
        salario = valorHora*horasTrabalhadas;
        System.out.println("NUMBER = " + identificador);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}
