import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float
        salario = input.nextFloat();

        if (salario >= 0 && salario <= 400){
            System.out.printf("Novo salario: %.2f\n",(salario+(salario*0.15)));
            System.out.printf("Reajuste ganho: %.2f\n", (salario*0.15));
            System.out.println("Em percentual: 15 %");
        } else if (salario > 400 && salario <= 800){
            System.out.printf("Novo salario: %.2f\n",(salario+(salario*0.12)));
            System.out.printf("Reajuste ganho: %.2f\n", (salario*0.12));
            System.out.println("Em percentual: 12 %");
        } else if (salario > 800 && salario <= 1200){
            System.out.printf("Novo salario: %.2f\n",(salario+(salario*0.1)));
            System.out.printf("Reajuste ganho: %.2f\n", (salario*0.1));
            System.out.println("Em percentual: 10 %");
        } else if (salario > 1200 && salario <= 2000){
            System.out.printf("Novo salario: %.2f\n",(salario+(salario*0.07)));
            System.out.printf("Reajuste ganho: %.2f\n", (salario*0.07));
            System.out.println("Em percentual: 7 %");
        } else if (salario > 2000){
            System.out.printf("Novo salario: %.2f\n",(salario+(salario*0.04)));
            System.out.printf("Reajuste ganho: %.2f\n", (salario*0.04));
            System.out.println("Em percentual: 4 %");
        }
    }
}
