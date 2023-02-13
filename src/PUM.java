import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int contador = 1;
        for(int i = 1; i <= (num*4); i++){
            System.out.printf("%d ", i);
            if(contador == 3){
                System.out.println("PUM");
                contador = 0;
                i++;
            }
            contador++;
        }
    }
}
