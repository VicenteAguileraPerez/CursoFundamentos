package fundamentos._09_ejercicios_figuras;

import java.util.Scanner;

public class Figura1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero de filas");
        int nFilas=in.nextInt();
        int nBlancos=0;//(nfilas*2)-2
        for (int i = nFilas; i >0 ; i--)//i=0;i<=nfilas;i++
        {
            //asteriscos
            for (int j = 1; j <=i ; j++)
            {
                System.out.print("*");
            }
            //espacios en blanco
            for (int j = 1; j <=nBlancos ; j++)
            {
                System.out.print(" ");
            }
            //asteriscos
            for (int j = 1; j <=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            nBlancos+=2;//nblancos-=2;
        }
    }
}
