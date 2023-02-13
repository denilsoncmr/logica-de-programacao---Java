import java.util.Scanner;

public class Bazinga {
    /*a tesoura corta o papel;
o papel embrulha a pedra;
a pedra esmaga o lagarto;
o lagarto envenena Spock;
Spock destrói a tesoura;
a tesoura decapita o lagarto;
o lagarto come o papel;
o papel contesta Spock;
Spock vaporiza a pedra;
a pedra quebra a tesoura. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sheldon, raj;
        int teste = input.nextInt();
        
        for(int i = 1; i <= teste; i++){
            sheldon = input.next(); 
            raj = input.next();
            if(sheldon == raj){
                System.out.printf("Caso #%d: De novo!", i);
            }else if(sheldon.equals("tesoura")){
                if(raj.equals("papel")){
                    System.out.printf("Caso #d: Bazinga!", i);
                }else if(raj.equals("lagarto")){
                    System.out.printf("Caso #d: Bazinga!", i);
                }else if(raj.equals("Spock")){
                    System.out.printf("Caso #d: Raj trapaceou!", i);
                }else if(raj.equals("pedra")){
                    System.out.printf("Caso #d: Raj trapaceou!", i);
                }
            }else if(sheldon.equals("papel")){
                if(raj.equals("pedra")){
                    System.out.printf("Caso #d: Bazinga!", i);
                }else if(raj.equals("lagarto")){
                    System.out.printf("Caso #d: Raj trapaceou!", i);
                }else if(raj.equals("Spock")){
                    System.out.printf("Caso #d: Bazinga!", i);
                }
            }else if(sheldon.equals("pedra")){
                if(raj.equals("raj")){
                    
                }
            }
        }
        
    }
}
