import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0, cod;
        boolean chave = true;
        while(chave == true){
            cod = input.nextInt();
            switch(cod){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    chave = false;
                    break;
                default:
                    continue;
                
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
    }
}
