import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;
        x1 = teclado.nextFloat();
        y1 = teclado.nextFloat();
        x2 = teclado.nextFloat();
        y2 = teclado.nextFloat();
        distancia =  (Math.pow(x1-x2, 2) + Math.pow(y1-y2,2));
        distancia = Math.pow(distancia, 0.5);
        System.out.printf("%.4f", distancia);
        
    }
}
