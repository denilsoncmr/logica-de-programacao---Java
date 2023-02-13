import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chave = 1, contador = 0, timeI, timeG, empates = 0, total = 0, gremio = 0, inter = 0;
        while(chave == 1){
            timeI = input.nextInt();
            timeG = input.nextInt();
            if (timeI == timeG){
                empates++;
            } else if (timeI > timeG){
                inter++;
            } else{
                gremio++;
            }
            contador++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            chave = input.nextInt();
        }
        System.out.printf("%d grenais\n", contador);
        System.out.printf("Inter:%d\n",inter);
        System.out.printf("Gremio:%d\n", gremio);
        System.out.printf("Empates:%d\n",empates);
        if (empates >= inter && empates >= gremio){
            System.out.println("Nao houve vencedor");
        } else if (inter > gremio){
            System.out.println("Inter venceu mais");
        } else if (gremio > inter){
            System.out.println("Gremio venceu mais");
        }

    }
}
