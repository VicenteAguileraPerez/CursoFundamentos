package fundamentos._04_fors;

import java.util.Scanner;

public class For4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Introduce N: ");
        n = in.nextInt();

        int ncuadrada=0;
        for(int i = 1;i<=n;i++)
        {
           //2*i-1
            ncuadrada+=(2*i-1);
        }
        System.out.println("N^2="+ncuadrada);

    }
}
