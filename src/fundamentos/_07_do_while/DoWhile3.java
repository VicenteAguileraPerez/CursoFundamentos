package fundamentos._07_do_while;

import java.util.Scanner;

public class DoWhile3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        int multiplo5=0;
        System.out.println("Introduce N: ");
        n = in.nextInt();

        int i = 1;
        do{

            if(i%5==0)
            {
                multiplo5++;
            }
            i++;
        }while(i<=n);
        System.out.println("multiplos de 5: "+multiplo5);
    }
}
