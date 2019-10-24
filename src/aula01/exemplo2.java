package aula01;

import java.util.Scanner;

public class exemplo2 {

    public static void main(String[] args) {
        int idade;
        String nome;

        Scanner entrada = new Scanner(System.in);

        System.out.println("informe seu nome e idade");
        nome = entrada.nextLine();
        idade = entrada.nextInt();

        System.out.println("meu nome é " + nome + " e tenho " + idade + " anos");

    }
}
