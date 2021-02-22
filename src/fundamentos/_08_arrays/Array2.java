import java.util.Scanner;

public class Array2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double suma=0;

        System.out.println("Ingresa la cantidad de numeros a sumar: ");
        int cantidad= in.nextInt();
        double [] numeros = new double[cantidad];

        for (int i = 0; i < numeros.length ; i++)
        {
            System.out.println("introduce numero "+(i+1)+" :");
            numeros[i]=in.nextDouble();
        }

        for (double num :numeros)
        {
            suma=suma+num;
        }
        System.out.println("La suma es: "+suma);
    }
}
