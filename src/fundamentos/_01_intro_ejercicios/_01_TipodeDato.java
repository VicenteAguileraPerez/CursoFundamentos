package fundamentos._01_intro_ejercicios;

public class _01_TipodeDato
{

    public static void main(String args[])
    {
        //Esta variable guarda la edad
        byte bytes = 127;//


       //_bytes1Esta_variable_guarda_la_edad$=0;
        System.out.println(bytes);
        boolean bool = false;
        System.out.println(bool);
        char caracter = 'P';
        System.out.println(caracter);
        String novia = "Paulina";
        System.out.println(novia);
        float flotante = 3.1415f;
        System.out.println(flotante);
        double doble = 3.1415927;
        System.out.println(doble);

        if(true)
        {
            //variable local
            int edad = 22;
            System.out.println(edad+bytes);
        }

        //constantes
        final double PI=3.1415927;


        System.out.println(Math.E);


    }
}

