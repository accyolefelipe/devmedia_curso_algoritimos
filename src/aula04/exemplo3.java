package aula04;

import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args) {
        int number1, number2, result;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("informe um numero entre 1 e 10: ");
        number1 = keyboard.nextInt();

        System.out.println("informe um numero qualquer: ");
        number2 = keyboard.nextInt();

        result = number2 % number1;

        switch (result){
            case(0):
                System.out.println(number2 + " é multiplo de " + number1);
                break;

            default:
                System.out.println(number2 + " não é multiplo de " + number1);
        }
    }
}
