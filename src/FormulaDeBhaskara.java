import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        delta = Math.pow(b, 2) - (4 * a * c);
        if(a == 0 || delta < 0){
            System.out.println("Impossivel calcular");  
        }else {
            delta = Math.pow(delta, 0.5);
            x1 = (-b + delta)/(2*a);
            x2 = (-b - delta)/(2*a);
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2); 
        }
        
    }
}

