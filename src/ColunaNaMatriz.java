import java.util.Scanner;

public class ColunaNaMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        int line = input.nextInt();
        double soma = 0, media;
        char operator = input.next().charAt(0);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = input.nextDouble();
            }
        }

        if(operator == 'S'){
            for(int i = 0; i < matriz.length; i++){
                soma += matriz[line][i];
            }
            System.out.printf("%.1f\n", soma);
        }else if(operator == 'M'){
            for(int i = 0; i < matriz.length; i++){
                soma += matriz[i][line];
            }
            media = soma/12.0;
            System.out.printf("%.1f\n", media);
        }
    }
}
