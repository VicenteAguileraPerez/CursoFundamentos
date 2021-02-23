package fundamentos._10_metodos_funciones_procedimientos;

import java.util.Scanner;

public class Metodos1
{
    /**
     * double suma(float a, double b);
     * double resta(float a, float b);
     * void   multiplicacion(int a, int b);
     * void division(float a, int b)  NOTA: SI b es = 0 entonces mostrar la palabra ERROR
    // */

    public static double suma(float a, double b)
    {
        double suma = a+b;
        return suma;//(a+b)
    }
    public static double resta(float a, float b)
    {
        return a-b;
    }
    public static void multiplicacion(int a, int b)
    {
        System.out.println("La multiplicacion de "+a+"*"+b+"="+(a*b));
    }
    public static void division(float a, int b)
    {
        if(b==0)
        {
            System.out.println("ERROR");
        }
        else
        {
            System.out.println("La division de "+a+"/"+b+"="+(a/b));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc;
        System.out.println("Calculadora de Practica de Funciones y Procedimiento");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("Elige una opción:");
        opc=in.nextInt();
        switch (opc)
        {
            case 1:
                float a1;
                double b1;
                System.out.println("Introduce a:");
                a1=in.nextFloat();
                System.out.println("Introduce b:");
                b1= in.nextDouble();
                System.out.println("La suma es: "+suma(a1,b1));
                break;
            case 2:
                float a2;
                float b2;
                System.out.println("Introduce a:");
                a2=in.nextFloat();
                System.out.println("Introduce b:");
                b2= in.nextFloat();
                System.out.println("La resta es: "+resta(a2,b2));
                break;
            case 3:
                int a;
                int b;
                System.out.println("Introduce a:");
                a=in.nextInt();
                System.out.println("Introduce b:");
                b= in.nextInt();
                multiplicacion(a,b);
                break;
            case 4:
                float a3;
                int b3;
                System.out.println("Introduce a:");
                a3=in.nextInt();
                System.out.println("Introduce b:");
                b3= in.nextInt();
                division(a3,b3);
                break;
            default:
                System.out.println("Opcion no válida");
                break;
        }
    }
}
