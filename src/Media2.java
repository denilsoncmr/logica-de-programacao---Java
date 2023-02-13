import java.util.Scanner;

public class Media2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double var1, var2, var3, media;
        var1 = teclado.nextDouble();
        var2 = teclado.nextDouble();
        var3 = teclado.nextDouble();
        media = ((var1*2)+(var2*3)+(var3*5))/10;
        System.out.printf("MEDIA = %.1f\n", media);
        
    }
}
