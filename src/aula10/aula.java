package aula10;

public class aula {

    public static void main(String[] args) {

        System.out.println("matriz com indice:");

        matriz_a();

        System.out.println("matriz sem indice e na ordem:");

        matriz_b();
    }

    public static void matriz_a() {

        int numeros[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        for (int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {

            for (int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {

                System.out.println("[" + indiceLinha + "," + indiceColuna + "]" + ": " + numeros[indiceLinha][indiceColuna]);
            }
        }
    }

    public static void matriz_b() {

        int numero[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        for (int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {

            for (int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {

                System.out.print("[" + numero[indiceLinha][indiceColuna] + "]");
            }

            System.out.println(" ");
        }
    }

}
