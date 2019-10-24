package aula10;

import java.util.Scanner;

public class exemplo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int choice;

        System.out.println("[1] - Alterar Matriz \n[0]- Sair");
        choice = entrada.nextInt();

        while(choice != 0) {

            matriz();

            System.out.println("[1] - Alterar Matriz \n[0]- Sair");
            choice = entrada.nextInt();
        }

        System.out.println("Aplicação Finalizada");

    }

    public static void matriz(){

        int mat[][] = new int[][]{
            {1,3,5,0,7},
            {2,5,8,1,0},
            {3,8,9,8,6},
            {6,9,0,3,6},
            {0,6,7,2,1},
        };

        int linha,coluna, valor;

        System.out.println("---------------Matriz---------------");
        for (int indiceLinha = 0; indiceLinha < 5; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < 5; indiceColuna++) {
                System.out.print("[" + mat[indiceLinha][indiceColuna] + "]");
            }
            System.out.println(" ");
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Linha: ");
        linha = keyboard.nextInt();
        System.out.println("Coluna: ");
        coluna = keyboard.nextInt();
        System.out.println("Valor: ");
        valor = keyboard.nextInt();

        for (int indiceLinha = 0; indiceLinha < 5; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < 5; indiceColuna++) {
                if (indiceLinha == linha & indiceColuna == coluna) {
                    mat[indiceLinha][indiceColuna] = valor;
                }
            }


        }

            System.out.println("---------------Matriz Alterada---------------");
            for (int indiceLinha = 0; indiceLinha < 5; indiceLinha++) {
                for (int indiceColuna = 0; indiceColuna < 5; indiceColuna++) {
                    System.out.print("[" + mat[indiceLinha][indiceColuna] + "]");
                }
                System.out.println(" ");
            }




    }


}
