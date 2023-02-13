import java.util.Scanner;

public class Media1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double var1, var2, media;
        var1 = teclado.nextFloat();
        var2 = teclado.nextFloat();
        media = ((var1*3.5) + (var2*7.5))/11;
        System.out.printf("MEDIA = %.5f\n", media);
    }
}
