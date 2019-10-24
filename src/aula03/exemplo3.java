package aula03;

import java.util.Scanner;

public class exemplo3 {

    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        number = keyboard.nextInt();

        if (number == 0) {
            System.out.println("numero igual a " + number);
        }
        else if (number < 0){
            System.out.println("numero " + number + " negativo");
        }
        else if (number % 2 == 0 ){
            System.out.println("o " + number + " é um numero par");
        }
        else{
            System.out.println("o " + number + " é um numero impar");
        }

    }
}
