import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio, volume;
        raio = teclado.nextDouble();
        volume = (4.0/3)*3.14159*(Math.pow(raio, 3));
        System.out.printf("VOLUME = %.3f", volume);
    }
}
