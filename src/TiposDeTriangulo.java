import java.util.Scanner;

public class TiposDeTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a,b,c, aux;

        a = input.nextFloat();
        b = input.nextFloat(); 
        c = input.nextFloat();
        if (a < b){
            aux = a;
            a = b;
            b = aux;
         }  
         if (a < c){
             aux = a;
             a = c;
             c = aux;
         } 
         if (b < c){
             aux = b;
             b = c;
             c = aux;
         }
        if(a >= (b+c)){
            System.out.println("NAO FORMA TRIANGULO");
        } else if ((a*a) == (b*b+c*c)){
            System.out.println("TRIANGULO RETANGULO");
        } else if ((a*a) > (b*b+c*c)){
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if ((a*a) < (b*b+c*c)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == b && b == c){
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || b == c || c == a){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
