import java.util.Scanner;

public class Array3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] num = new int[5][4];
                            //[filas][columnas]
        /*{
         * {1,2,3,4},
         * {5,6,7,8},
         * {9,10,11,12},
         * {13,14,15,16},
         * {17,18,19,20}
         * }
         */
        int [][] num2 ={  {1,5,6,22},
                          {25,25,55,200},
                          {12,45,10,150},
                          {-3,7,58,1230},
                          {-3,7,58,1230}
        };

        //2,3-->150
        //array[X];
        //array[f][c];
        System.out.println(num2[2][3]);//150

       /* for (int f=0;f<5;f++)
        {
            for (int c=0;c<4;c++)
            {
                System.out.println("elemento fila ["+f+"] columna["+c+"]:");
                num[f][c]=in.nextInt();
            }
        }*/

        for (int f=0;f<5;f++)
        {
            for (int c=0;c<4;c++)
            {
                System.out.println("elemento fila ["+f+"] columna["+c+"]="+num2[f][c]);

            }
        }
        //int x[][][]= new int [2][2][2];
        //for(int num3[][]: x)
        //    []          [][]
        System.out.println("For Each");
        for (int num1[] : num2  )
        {
            for (int numero :num1)
            {
                System.out.println("elemento es: "+numero);

            }
        }

    }
}
