package fundamentos._01_intro_ejercicios;

import java.util.Scanner;

public class _04_Inverso
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;//ingresado
        int ni;//inverso

        System.out.println("Introduce N: ");
        n= entrada.nextInt();//12345

        ni=n%10;//5
        n=n/10;//1234

        ni=(ni*10)+n%10;//50+4=54
        n=n/10;//123

        ni=(ni*10)+n%10;//540+3=543
        n=n/10;//12

        ni=(ni*10)+n%10;//5430+2=5432
        n=n/10;//1

        ni=ni*10+n;//54320+1=54321
        System.out.println(ni);//54321
       // System.out.println(n);//12

    }
}
