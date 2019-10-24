package aula04;

import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("informe um numero entre 1 e 3: ");
        number = keyboard.nextInt();

        switch (number){
            case(1):
                System.out.println("o numero escolhido foi o: " + number);
                    break;

            case(2):
                System.out.println("o numero escolhido foi o: " + number);
                    break;

            case(3):
                System.out.println("o numero escolhido foi o: " + number);
                    break;


            default:
                System.out.println("Unexpected value: " + number);
        }
    }
}
