package aula06;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {

        int number;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("informe um numero entre 1 e 10");
        number = keyboard.nextInt();

        while (number <= 10) {
            System.out.println("-------- tabuada do " + number + " --------");

            int counter = 0;
            while (counter <= 10) {
                System.out.println(number + " x " + counter + " = " + (number * counter));
                counter++;
            }

        number++;
        }
    }
}
