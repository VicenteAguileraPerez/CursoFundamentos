package fundamentos._04_fors;

import java.util.Scanner;

public class For5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Introduce N: ");
        n = in.nextInt();
        int suma=0;
        for(int i = 1;i<n;i++)
        {
           if(n%i==0)
           {
               System.out.println(i);
               suma+=i;//suma=suma+i;
           }
        }
        if(suma==n)
        {
            System.out.println("Perfecto");
        }
        else
        {
            System.out.println("No perfecto");
        }



    }
}
