package fundamentos._07_do_while;

import java.util.Scanner;

public class DoWhile2
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
            do
            {
                suma=suma+i;// suma+=i
                i++;

            }while(i<=n);

            System.out.println("Suma: "+suma);
        }
        else
        {
            System.out.println("Debes de introducir un valor superior a 0");
        }


    }
}
