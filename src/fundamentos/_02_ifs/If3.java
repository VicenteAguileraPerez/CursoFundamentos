package fundamentos._02_ifs;

import java.util.Scanner;

public class If3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char c;

        System.out.println("Introduce una letra: ");
        c = in.next().charAt(0);//hola568653683543456789ertyui

        if(c=='a' || c=='A')
        {
            System.out.println("Vocal");
        }
        else if(c=='e' || c=='E')
        {
            System.out.println("Vocal");
        }
        else if(c=='i' || c=='I'){
            System.out.println("Vocal");
        }
        else if(c=='o' || c=='O')
        {
            System.out.println("Vocal");
        }else if(c=='u' || c=='U')
        {
            System.out.println("Vocal");
        }
        else
        {
            System.out.println("No Vocal");
        }

    }
}
