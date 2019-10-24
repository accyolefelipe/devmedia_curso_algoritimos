package aula07;

import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args) {

        double salario, reajuste = 0.0 , porcentagem;
        int choice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("--------------Reajustando Salario--------------");


            do {
            System.out.println("salario atual: ");
            salario = keyboard.nextDouble();

            System.out.println("[1] para 15% de reajuste \n[2] para 20% de reajuste e [3]\n para escolher valor de reajuste");
            choice = keyboard.nextInt();

            switch (choice){
                case(1):
                    reajuste = salario * 0.15;
                    break;
                case(2):
                    reajuste = salario * 0.20;
                    break;
                case(3):
                    System.out.println("informe a % de reajuste");
                    porcentagem = keyboard.nextDouble();
                    reajuste = salario * (porcentagem / 100);
                    break;
                default:
                    System.out.println("opção invalida");

                }

                System.out.println("salario atual R$: " + salario +  "\t");
                System.out.println("Reajuste R$: " + reajuste + "\t");
                System.out.println("Montante R$: " + (salario + reajuste) + "\t");

                System.out.println("[1]- continuar \n[0]- sair");
                choice = keyboard.nextInt();

            } while (choice != 0);

                System.out.println("programa encerrado");







    }
}
