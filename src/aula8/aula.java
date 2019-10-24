package aula8;

import java.util.Scanner;

public class aula {

    public static void main(String[] args) {

        int choice;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("[1]- cadastro \n[2]- exibir dados\n[0]- sair");
        choice = keyboard.nextInt();

        while (choice != 0) {

            if (choice == 1) {
                System.out.println("cadastrar dados");
            }
            else if (choice == 2) {
                System.out.println("exibir dados");
            }

            System.out.println("[1]- cadastro \n[2]- exibir dados\n[3]- sair");
            choice = keyboard.nextInt();


        }

        System.out.println("aplicação finalizada");
    }
}
