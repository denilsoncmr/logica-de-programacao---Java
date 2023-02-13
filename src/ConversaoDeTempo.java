import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int number, hour, minutes, seconds, resto;

        number = teclado.nextInt();

        hour = number / 3600;
        resto = number % 3600;

        minutes = resto / 60;
        seconds = resto % 60;

        System.out.printf("%d:%d:%d\n", hour, minutes, seconds);
    }
}
