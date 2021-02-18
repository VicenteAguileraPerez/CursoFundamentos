package fundamentos._04_fors;

import java.util.Scanner;

public class For2
{
    public static void main(String[] args) {
        //sumar los primeros N numeros
        Scanner in = new Scanner(System.in);
        long n;
        long suma=0;
        System.out.println("Introduce N: ");
        n = in.nextInt();

        /**
         *   1   2     3      4      5            n-2  n-1  n  = S
         *   n   n-1   n-2    n-3    n-4           3    2   1  = S
         *   _________________________________________________________
         *   n+1  n+1  n+1    n+1   n+1           n+1  n+1  n+1  = 2S
         *   n(n+1)                                              =2S
         *
         *   S=n*(n+1)/2
         *
         * 1784293664
         */
        if(n>0)
        {
            for(int i = 1;i<=n;i++)
            {
                suma=suma+i;// suma+=i
            }
            System.out.println("Suma: "+suma);
            //S=n(n+1)/2 Gauss
            long suma2=n*(n+1)/2;
            System.out.println(suma2);
        }
        else
        {
            System.out.println("Debes de introducir un valor superior a 0");
        }


    }
}
