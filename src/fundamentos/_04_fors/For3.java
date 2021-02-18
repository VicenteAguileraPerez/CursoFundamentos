package fundamentos._04_fors;

import java.util.Scanner;

public class For3 {


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        int multiplo5=0;
        System.out.println("Introduce N: ");
        n = in.nextInt();

        for(int i = 1;i<=n;i++)
        {
            if(i%5==0)
            {
                multiplo5++;
            }
        }
        System.out.println("multiplos de 5: "+multiplo5);
    }
}




