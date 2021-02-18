package fundamentos._06_whiles;

import java.util.Scanner;

public class While3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        int multiplo5=0;
        System.out.println("Introduce N: ");
        n = in.nextInt();

        int i = 0;
        while(i<=n)
        {
            i++;
            if(i%5==0)
            {
                multiplo5++;
            }

        }
        System.out.println("multiplos de 5: "+multiplo5);
    }
}
