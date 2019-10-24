package aula04;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        int choice;
        double number1, number2;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("informe dois numeros: ");
        number1 = keyboard.nextDouble();
        number2 = keyboard.nextDouble();

        System.out.println("informe a operação desejada: \n1- adição \n2- subtração \n3- multiplicação \n4- divisão \n5- media");
        choice = keyboard.nextInt();

        switch (choice){
            case(1):
                System.out.println("A adição entre: " + number1 + " e " + number2 + " é igual a: " + (number1 + number2));
                break;

            case(2):
                System.out.println("A subtração entre: " + number1 + " e " + number2 + " é igual a: " + (number1 - number2));
                break;

            case(3):
                System.out.println("A multiplicação entre: " + number1 + " e " + number2 + " é igual a: " + (number1 * number2));
                break;

            case(4):
                System.out.println("A divisão entre: " + number1 + " e " + number2 + " é igual a: " + (number1 / number2));
                break;

            case(5):
                System.out.println("A media entre: " + number1 + " e " + number2 + " é igual a: " + (number1 + number2)/2);
                break;

            default:
                System.out.println("operação informada invalida " + choice);
        }
    }
}
