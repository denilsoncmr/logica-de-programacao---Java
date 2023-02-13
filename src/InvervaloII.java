import java.util.Scanner;

public class InvervaloII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, num, dentro = 0, fora = 0;

        num = input.nextInt();

        for(int i = 0; i < num; i++){
            valor = input.nextInt();
            if(valor >= 10 && valor <= 20){
                dentro++;
            } else{
                fora++;
            }
        }
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
    }
}
