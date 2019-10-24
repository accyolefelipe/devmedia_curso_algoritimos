package aula03;

import java.util.Scanner;

public class exemplo4 {

    public static void main(String[] args) {

        double n1,n2,n3, media;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe suas tres notas: ");
        n1 = keyboard.nextDouble();
        n2 = keyboard.nextDouble();
        n3 = keyboard.nextDouble();

        media = (n1 + n2 +n3)/3;

        if (media >= 7 ){
            System.out.println("Aluno aprovado com a media: " + media);
        }
        else if((media >= 4) & (media < 7)){
            System.out.println("Aluno em recuperação com a media: " + media);
        }
        else{
            System.out.println("Aluno Reprovado com a media: " + media);
        }
    }
}
