package fundamentos._03_switch;

import java.util.Scanner;

public class Sw1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte n;
        System.out.println("Introduce n: ");
        n=in.nextByte();

        switch (n)
        {
            case 1://if(n==1)
                System.out.println("Verano");
                break;
            case 2://else if(n==2)
                System.out.println("Otoño");
                break;
            case 3://else if(n==3)
                System.out.println("Inviero");
                break;
            case 4://else if(n==4)
                System.out.println("Primavera");
                break;
            default://else
                System.out.println("Opción no válida");
                break;
        }
    }
}
