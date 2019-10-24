package aula02;

import java.util.Scanner;

public class aula {

    public static void main(String[] args) {

        int n1, n2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("informe n1 e n2");
        n1= entrada.nextInt();
        n2= entrada.nextInt();

        System.out.println( "n1 == n2 : " +  (n1 == n2) );
        System.out.println( "n1 != n2 : " +  (n1 != n2) );
        System.out.println( "n1 > n2 : " +  (n1 > n2) );
        System.out.println( "n1 < n2 : " +  (n1 < n2) );
        System.out.println( "n1 >= n2 : " +  (n1 >= n2) );
        System.out.println( "n1 <= n2 : " +  (n1 <= n2) );

        System.out.println("------------------------------------");

        System.out.println( (n1 == n2) & (n1 >= n2) );
        System.out.println( (n1 == n2) || (n1 >= n2) );
        System.out.println( (n1 != n2) & (n1 >= n2) );



    }
}
