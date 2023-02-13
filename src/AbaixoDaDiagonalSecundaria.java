import java.util.Scanner;

public class AbaixoDaDiagonalSecundaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        double soma = 0, media;
        int aux = 1;
        char operator = input.next().charAt(0);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = input.nextDouble();
            }
        }

        if(operator == 'S'){
            for(int i = matriz.length - 1; i > 0; i--){
                for(int j = aux; j < matriz.length; j++){
                    soma += matriz[i][j];
                }
                aux++;
            }
            System.out.printf("%.1f\n", soma);
        }else if(operator == 'M'){
            for(int i = matriz.length - 1; i > 0; i--){
                for(int j = aux; j < matriz.length; j++){
                    soma += matriz[i][j];
                }
                aux++;
            }
            media = soma/6.0;
            System.out.printf("%.1f\n", media);
        }
    }
}
