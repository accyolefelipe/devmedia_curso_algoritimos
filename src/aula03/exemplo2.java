package aula03;

import java.util.Scanner;

public class exemplo2 {

    public static void main(String[] args) {
        int number;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um numero entre 1 e 3");
        number = keyboard.nextInt();

        if (number == 1) {
            System.out.println("o numero de entrada foi: " + number);
        }
        else if (number == 2 ){
            System.out.println("o numero de entrada foi: " + number);
        }
        else if (number == 3){
            System.out.println("o numero de entrada foi: " + number);
        }
        else{
            System.out.println("o numero de entrada foi: " + number +  "\ndiferente de 1, 2 ou 3");
        }


    }
}
