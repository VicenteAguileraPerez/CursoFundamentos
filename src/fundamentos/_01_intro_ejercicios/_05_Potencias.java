package fundamentos._01_intro_ejercicios;

import java.util.Scanner;

public class _05_Potencias
{
    public static void main(String[] args)
    {
        Scanner entradas = new Scanner(System.in);

        //Inputs
        /**
         * Enteras
         * a: base
         * n: veces que tengo que mult a por si misma.
         */
        //Outputs
        /**
         * p: potencia
         */
        int a;
        int n;
        System.out.println("Introduce a: ");
        a = entradas.nextInt();
        System.out.println("Introduce n: ");
        n = entradas.nextInt();
        int p = (int) (Math.pow(a,n));//cast

        System.out.println("Potencia "+p);

        //int   = (int) (double)


    }
}
