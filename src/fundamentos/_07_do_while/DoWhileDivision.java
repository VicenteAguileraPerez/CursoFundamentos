package fundamentos._07_do_while;

import java.util.Scanner;

public class DoWhileDivision
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int contadorDeRestas=0;
        System.out.println("N1: ");
        n1= input.nextInt();
        System.out.println("N2: ");
        n2= input.nextInt();//>0
        if(n2>0)
        {
            //division
            boolean controlCiclo=true;  //for(in;con;    )
            int resta;
            do {
                //    10-2=8-2=6
                resta=n1-n2;
                System.out.println(resta);
                if(resta>=0)//resta>=n2 || resta>=0
                {
                    n1=resta;
                    contadorDeRestas++;
                    controlCiclo=true;
                }
                else
                {
                    controlCiclo=false;
                }

            }while (controlCiclo);
            System.out.println("La division de n1/n2="+contadorDeRestas);
        }
        else
        {
            System.out.println("n2 debe ser superior a 0");
        }

    }
}
