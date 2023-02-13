import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salario = input.nextFloat();
        double taxa;

        if (salario >= 0 && salario <= 2000){
            System.out.println("Isento");
        } else if (salario > 2000 && salario <= 3000){
            taxa = (salario - 2000)*0.08;
            System.out.printf("R$ %.2f\n", taxa);
        } else if (salario > 3000 && salario <= 4500){
            taxa = ((salario - 3000) * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f\n", taxa);
        } else {
            taxa = ((salario - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f\n", taxa);
        }
    
    }
}
