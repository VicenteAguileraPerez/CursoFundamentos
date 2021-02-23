package fundamentos._08_arrays;

import java.util.Scanner;

public class Array4
{
    public static void main(String[] args) {
        //int [] nom = new int[10];
        //int [] nom = {1,2,3,5,...,100};

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


        int [][] num ={  {1,5,6,22},
                         {25,25,55,200},
                         {12,45,10,150},
                         {-3,7,58,1230}  };

        System.out.println(num[0][2]);

    }
}
