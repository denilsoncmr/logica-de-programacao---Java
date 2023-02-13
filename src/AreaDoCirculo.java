import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pi, raio, area;
        pi = 3.14159;
        raio = teclado.nextDouble();
        area = pi * (Math.pow(raio, 2));
        System.out.printf("A=%.4f", area);
    }
}
