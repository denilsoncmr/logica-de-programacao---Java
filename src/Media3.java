import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media, exame, mediaFinal;
        nota1 = input.nextFloat();
        nota2 = input.nextFloat();
        nota3 = input.nextFloat();
        nota4 = input.nextFloat();
        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + nota4)/10;
        if (media >= 7){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media < 7){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            exame = input.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", exame);
            mediaFinal = (media + exame)/2;
            if (mediaFinal >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);

            }else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }
        } else {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }
    }
}
