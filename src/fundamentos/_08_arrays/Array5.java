package fundamentos._08_arrays;

import java.util.Scanner;

public class Array5
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int f;
        int c;
        f=in.nextInt();//3
        c=in.nextInt();//2
        int [][] nom = new int[f][c];

        for (int i = 0; i < f ; i++)
        {
            for (int j = 0; j < c ; j++)
            {
                nom[i][j]=in.nextInt();
            }
        }
        int sumaFila=0;
        for (int i = 0; i < f ; i++)
        {
            for (int j = 0; j < c ; j++)
            {
                sumaFila=sumaFila+nom[i][j];
            }
            System.out.println("La suma de la fila "+i+" es: "+sumaFila);
            sumaFila=0;
        }

    }
}
