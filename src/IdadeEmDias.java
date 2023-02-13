import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int value, year, mounth, days, resto;

        value = teclado.nextInt();

        year = value / 365;
        resto = value % 365;

        mounth = resto / 30;
        days = resto % 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", year, mounth, days, args);

    }
}
