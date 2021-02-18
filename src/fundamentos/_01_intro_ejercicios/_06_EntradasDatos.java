package fundamentos._01_intro_ejercicios;


import java.util.Scanner;

public class _06_EntradasDatos
{
    public static void main(String[] args)
    {
        String nombre;
        short a;
        int b;
        int res;
        Scanner entradas = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        nombre = entradas.next();
        System.out.println("Introduce el valor de a: ");
        a = entradas.nextShort();
        System.out.println("Introduce el valor de b: ");
        b = entradas.nextInt();
        res=a+b;
        System.out.println("La suma es: "+res);
        System.out.println("Tu nombre es: "+nombre);

    }
}
