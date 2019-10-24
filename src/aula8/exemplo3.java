package aula8;

import java.util.Scanner;

public class exemplo3 {

    public static int somar(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {

        int number1,number2;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("informe o primeiro numero: ");
        number1 = keyboard.nextInt();

        System.out.println("informe o sugundo numero: ");
        number2 = keyboard.nextInt();



        System.out.println("resultado: " + somar(number1 , number2));
    }


}
