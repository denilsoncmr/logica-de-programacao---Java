import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inicio, fim;
        inicio = input.nextInt();
        fim = input.nextInt();

        if (inicio == fim){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (inicio > fim){
            System.out.printf("O JOGO DUROU %d HORA(S)", (24-inicio+fim));
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)", (fim-inicio));
        }
    }
}
