import java.util.Scanner;

public class AcimaDaDiagonalSecundária {
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
            for(int i = 0; i < matriz.length - 1; i++){
                aux++;
                for(int j = matriz.length - aux; j >= 0; j--){
                    soma += matriz[i][j];
                }
            }
            System.out.printf("%.1f\n", soma);
        }else if(operator == 'M'){
            for(int i = 0; i < matriz.length - 1; i++){
                aux++;
                for(int j = matriz.length - aux; j >= 0; j--){
                    soma += matriz[i][j];
                }
            }
            media = soma/6.0;
            System.out.printf("%.1f\n", media);
        }
    }
}
