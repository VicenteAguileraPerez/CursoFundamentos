package fundamentos._06_whiles;

import java.util.Scanner;

public class While2
{
    public static void main(String[] args) {
        //sumar los primeros N numeros
        Scanner in = new Scanner(System.in);
        long n;
        long suma=0;
        System.out.println("Introduce N: ");
        n = in.nextInt();

        if(n>0)
        {
            int i = 1;
            while(i<=n)
            {

                suma=suma+i;// suma+=i


                i++;
            }
            System.out.println("Suma: "+suma);
        }
        else
        {
            System.out.println("Debes de introducir un valor superior a 0");
        }


    }
}
