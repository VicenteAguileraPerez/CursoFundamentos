package fundamentos._02_ifs;

import java.util.Scanner;

public class If4
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("introduce n: ");
        n = in.nextInt();

        if(n%2==0)
        {
            System.out.println("Par");
        }
        else
        {
            System.out.println("Impar");
        }

    }
}
