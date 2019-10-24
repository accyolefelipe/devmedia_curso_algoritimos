package aula06;

import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args) {

        double number1, number2;
        int choice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("[1] para adição \n[2] para subtração \n[0] para sair");
        choice = keyboard.nextInt();

        while(choice != 0){
            System.out.println("digite o primeiro numero: ");
            number1 = keyboard.nextDouble();
            System.out.println("digite o segundo numero: ");
            number2 = keyboard.nextDouble();

            switch (choice){
                case (1):
                    System.out.println("a soma entre: " + number1 + " e " + number2 + " = " + (number1 + number2) );
                    break;

                case (2):
                    System.out.println("a subtração entre: " + number1 + " e " + number2 + " = " + (number1 - number2) );
                    break;

                default:
                    System.out.println("opção invalida");

            }
            System.out.println("[1] para adição \n[2] para subtração \n[0] para sair");
            choice = keyboard.nextInt();
        }

        System.out.println("Aplicação Finalizada");


    }
}
