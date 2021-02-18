package fundamentos._07_do_while;

public class DoWhile0
{
    public static void main(String[] args)
    {
        boolean bool=false;


        for(int i=0;bool;i++)
        {
            System.out.println("hola se ejecuto el for");
        }
        System.out.println("Fin del for");

        while (bool)
        {
            System.out.println("hola se ejecuto el while");
        }
        System.out.println("Fin del while");


        //inicializacion
        do {
            //incremento o decremento
            System.out.println("hola se ejecuto el do while");

        }while(bool);//condicion
        System.out.println("Fin del do while");

    }
}
