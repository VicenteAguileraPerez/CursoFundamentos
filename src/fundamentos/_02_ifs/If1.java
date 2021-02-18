package fundamentos._02_ifs;

import java.util.Scanner;

public class If1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        System.out.println("introduce n1: ");
        n1 = in.nextInt();
        System.out.println("introduce n2: ");
        n2 = in.nextInt();

        if(n1>n2)
        {
            System.out.println(n1);
        }
        else
        {
            System.out.println(n2);
        }

    }
}
