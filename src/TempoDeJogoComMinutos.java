import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horaInicial, minInicial, horaFinal, minFinal;

        horaInicial = input.nextInt();
        minInicial = input.nextInt();
        horaFinal = input.nextInt();
        minFinal = input.nextInt();

        if (horaInicial == horaFinal){
            if (minInicial == minFinal){
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            } else if (minInicial > minFinal){
                System.out.printf("O JOGO DUROU 23 HORA(S) E %d MINUTO(S)\n", (60-(minInicial-minFinal)));
            } else if (minInicial < minFinal){
                System.out.printf("O JOGO DUROU 0 HORA(S) E %d MINUTO(S)\n", (minFinal-minInicial));
            }
        } else if (horaInicial > horaFinal){
            if (minInicial == minFinal){
                System.out.printf("O JOGO DUROU %d HORA(S) E 0 MINUTO(S)\n", (24-(horaInicial-horaFinal)));
            } else if (minInicial > minFinal){
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (23-(horaInicial-horaFinal)), (60-(minInicial-minFinal)));
            } else if (minInicial < minFinal){
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (24-(horaInicial-horaFinal)), (minFinal-minInicial));
            }
        } else {
            if (minInicial == minFinal){
                System.out.printf("O JOGO DUROU %d HORA(S) E 0 MINUTO(S)\n", (horaFinal-horaInicial));
            } else if (minInicial > minFinal){
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (horaFinal-horaInicial-1), (60-(minInicial-minFinal)));
            } else if (minInicial < minFinal){
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (horaFinal-horaInicial), (minFinal-minInicial));
            }
        }
    }
}
