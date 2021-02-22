package fundamentos._08_arrays;

import java.util.Scanner;

public class Array0
{
    public static void main(String[] args) {

        String[] nombres = new String[3];

        nombres[0] = "Paulina";
        nombres[1] = "Vicente";
        nombres[2] = "David";

        System.out.println(nombres.length);//ver cuanto elementos hay en una matriz de una dimension
        System.out.println(nombres[0]);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        //break
        for (int i = 0; i < nombres.length; i++) {
            if (i == 1) {
                break;
            }
            System.out.println(nombres[i]);
        }
        //continue
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals("Vicente")) {
                continue;
            }
            System.out.println(nombres[i]);
        }

        int[] edades = {21, 22, 18};

        int [] valores= new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <valores.length ; i++)
        {
            valores[i]=in.nextInt();
        }
        for (int i = 0; i <valores.length ; i++)
        {
            System.out.println(valores[i]);
        }
        for (int elemento : valores)
        {
            System.out.println(elemento);
        }
    }
    //                                                                                       elemento
    /**    0                 1                2
     * **************************************************
     *     Paulina     *  Vicente        *    David     *
     * **************************************************
     *   1                2                   3                 4                  5
     */
}
