import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int distancia;
        float combustivelGasto, consumoMedio;
        distancia = teclado.nextInt();
        combustivelGasto = teclado.nextFloat();
        consumoMedio = distancia/combustivelGasto;
        System.out.printf("%.3f km/l", consumoMedio);
    }
}
