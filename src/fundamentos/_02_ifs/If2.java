package fundamentos._02_ifs;

import java.util.Scanner;

public class If2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce N: ");
        int n = in.nextInt();

        if(n>0)
        {
            System.out.println("Positivo");
        }
        else if(n<0)
        {
            System.out.println("Negativo");
        }
        else
        {
            System.out.println("Es Cero");
        }

    }
}
