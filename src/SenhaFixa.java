import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean chave = true;
        int senha;
        while (chave){
            senha = input.nextInt();
            if (senha == 2002){
                System.out.println("Acesso Permitido");
                chave = false;
            }else{
                System.out.println("Senha Invalida");
            }
        }
    }  
} 
