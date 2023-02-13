import java.util.Scanner;

public class GastoDeCombustivel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tempo, velMedia;
        double combustivelGasto;

        tempo = teclado.nextInt();
        velMedia = teclado.nextInt();

        combustivelGasto = tempo *velMedia/12.0;

        System.out.printf("%f", combustivelGasto);
    
    }
}
