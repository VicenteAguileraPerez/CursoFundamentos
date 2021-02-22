import java.util.Scanner;

public class Array1
{
    public static void main(String[] args)
    {

        //[]
        Scanner in = new Scanner(System.in);

        int [] edades = new int[2]; //0 1 2 3 4
        //                      0          1        2
        String [] nombres = {"Paulina","Vicente","David","Vicente"};



        System.out.println(edades.length);
        edades[0]=21;
        edades[1]=22;
        System.out.println(edades[0]);
        System.out.println(edades[1]);
        for(int i=0;i<=edades.length-1;i++)
        {
            edades[i]=in.nextInt();
        }
        for(int i=0;i<=edades.length-1;i++)
        {
            System.out.println(edades[i]);
        }

        for(int i=0;i<nombres.length;i++)
        {
            System.out.println(nombres[i]);
        }
        int i=0;
        while(i<nombres.length)
        {
            System.out.println(nombres[i++]);
        }
        int i1=0;
        do {
            System.out.println(nombres[i1++]);
        }while(i1<nombres.length);

        //
        // String [] nombres = {"Paulina","Vicente","David","Vicente"};
        for (String nombre : nombres)
        {
            //break continue
            if(nombre.equals("David"))
            {
                break;
            }
            System.out.println(nombre);
        }





    }
}
