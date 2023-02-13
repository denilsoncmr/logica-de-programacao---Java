import java.util.Scanner;

public class NotasComValidacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cod = 0, nota, soma = 0, contador = 0;
        boolean chave = true, chave2 = true;
        while (chave == true){
            nota = input.nextFloat();
            if (nota >= 0 && nota <= 10){
                soma += nota;
                contador++;
            }
            else{
                System.out.println("Nota invalida");
            }

            if(contador == 2){
                System.out.printf("media = %.2f\n", (soma/2));
                contador = 0;
                soma = 0;
                while (chave2 == true){
                    System.out.println("novo calculo (1-sim 2-nao)");
                    cod = input.nextInt();
                    if (cod == 1){
                        chave2 = false;
                    } else if (cod == 2){
                        chave2 = false;
                        chave = false;
                    }
                }
            }
            chave2 = true;
        }
    }
}
