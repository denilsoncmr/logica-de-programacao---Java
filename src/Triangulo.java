import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float a,b,c,aux, area;
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        
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
        
        if (a >= (b+c)){
            area = ((a+b)*c)/2;
            System.out.printf("Area = %.1f", area);
            
        } else{
            System.out.println("Perimetro = "+ (a+b+c));   
        }

    }
}
