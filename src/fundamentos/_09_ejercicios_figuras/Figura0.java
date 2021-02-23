package fundamentos._09_ejercicios_figuras;

import java.util.Scanner;

public class Figura0
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Introduce la altura del rectangulo");
        n=in.nextInt();

        /**
         *    ******
         *    ******
         *    ******
         */
        for (int i = 1; i <=n ; i++)
        {
            System.out.println("******");
        }
        System.out.println();
        for (int i = 1; i <=n ; i++)
        {
            if(i==1 || i==n)
            {
                System.out.println("******");
            }
            else
            {
                System.out.println("*    *");
            }

        }
        System.out.println();
        for (int i = 1; i <=n ; i++)
        {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /**
         *
         *     *
         *     **
         *     ***
         *
         */


    }
}
