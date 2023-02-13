import java.util.Scanner;
public class SortSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,c,aux, x,y,z;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        x = a;
        y = b;
        z = c;
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
        System.out.println(""+c);
        System.out.println(""+b);
        System.out.println(""+a);
        System.out.println("");
        System.out.println(""+x);
        System.out.println(""+y);
        System.out.println(""+z);
    }
}
