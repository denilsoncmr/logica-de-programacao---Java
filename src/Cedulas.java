import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, nCem, nCinq, nVin, nDez, nCinc, nDois, nUm, resto;

        valor = teclado.nextInt();

        nCem = valor/100;
        resto = valor%100;

        nCinq = resto/50;
        resto = resto%50;

        nVin = resto/20;
        resto = resto%20;

        nDez = resto/10;
        resto = resto%10;

        nCinc = resto/5;
        resto = resto%5;

        nDois = resto/2;
        nUm = resto%2;

        System.out.println(valor);
        System.out.println(nCem + " nota(s) de R$ 100,00");
        System.out.println(nCinq + " nota(s) de R$ 50,00");
        System.out.println(nVin + " nota(s) de R$ 20,00");
        System.out.println(nDez + " nota(s) de R$ 10,00");
        System.out.println(nCinc + " nota(s) de R$ 5,00");
        System.out.println(nDois + " nota(s) de R$ 2,00");
        System.out.println(nUm + " nota(s) de R$ 1,00");
    }   
}
