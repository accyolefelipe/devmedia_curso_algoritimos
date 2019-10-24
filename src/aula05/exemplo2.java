package aula05;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        int number, counter;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("digite um numero entre 1 e 10");
        number = keyboard.nextInt();

        for (counter = 0; counter <=10; counter++){
            System.out.println(number + " x " + counter + " = " + (number * counter));
        }
    }
}
