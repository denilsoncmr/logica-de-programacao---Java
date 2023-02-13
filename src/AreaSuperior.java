import java.util.Scanner;

public class AreaSuperior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        double soma = 0, media;
        char operator = input.next().charAt(0);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = input.nextDouble();
            }
        }

        if(operator == 'S'){
            for(int i = 0; i < (matriz.length-1)/2; i++){
                for(int j = i+1; j < (matriz.length-1)/2; j++){
                    soma += matriz[i][j];
                }
            }
            System.out.printf("%.1f\n", soma);
        }else if(operator == 'M'){
            for(int i = 0; i < matriz.length -1; i++){
                for(int j = i+1; j < matriz.length; j++){
                    soma += matriz[i][j];
                }
            }
            media = soma/66.0;
            System.out.printf("%.1f\n", media);
        }
    }
}
