package aula01;

import java.util.Scanner;

public class aula {

    public static void main(String[] args) {

       double n1,n2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe um numero");
        n1 = teclado.nextDouble();

        System.out.println("informe outro numero");
        n2 = teclado.nextDouble();


        System.out.println("a soma dos numeros é de: "+ (n1+n2));

        System.out.println("a media entre os numeros é de: " + (n1+n2)/2);



























    }

}
