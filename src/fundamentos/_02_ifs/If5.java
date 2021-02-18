package fundamentos._02_ifs;

import java.util.Scanner;

public class If5
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2,n3;
        System.out.println("introduce n1: ");
        n1 = in.nextInt();
        System.out.println("introduce n2: ");
        n2 = in.nextInt();
        System.out.println("introduce n3: ");
        n3 = in.nextInt();

        /**
         *  n1>n2 && n1>n3 ----> n1 if
         *  n2>n1 && n2>n3 ----> n2 else if
         *  n3                      else
         */
        if(n1>n2 && n1>n3)
        {
            System.out.println(n1);
        }
        else if(n2>n1 && n2>n3)
        {
            System.out.println(n2);
        }
        else
        {
            System.out.println(n3);
        }






    }
}
