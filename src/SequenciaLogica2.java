import java.util.Scanner;

public class SequenciaLogica2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x,y, contador = 1;
        x = input.nextInt();
        y = input.nextInt();

        for(int i = 1; i <= y; i++){
            if (contador == x){
                System.out.println(i);
                contador = 1;
            }else{
                System.out.printf("%d ",i);
                contador++;
            }
        }

    }
}
