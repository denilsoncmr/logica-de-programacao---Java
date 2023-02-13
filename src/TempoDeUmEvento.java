import java.util.Scanner;

public class TempoDeUmEvento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diaInicial, horaInicial, minInicial,segInicial, diaFinal, horaFinal, minFinal, segFinal;

        diaInicial = input.nextInt(); 
        horaInicial = input.nextInt();
        minInicial = input.nextInt();
        segInicial = input.nextInt();
        diaFinal = input.nextInt();
        horaFinal = input.nextInt();
        minFinal = input.nextInt();
        segFinal = input.nextInt();

        System.out.println(diaInicial);
        System.out.println(diaFinal);
    }
}
