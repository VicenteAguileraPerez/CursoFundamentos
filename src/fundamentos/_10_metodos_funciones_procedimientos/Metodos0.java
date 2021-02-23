package fundamentos._10_metodos_funciones_procedimientos;




public class Metodos0
{

    // metodo tiene un tipo de dato int, short, byte, String,.... al lado izq de el nombre del metodo se llama función
    // return
    public static int sumaFuncion(/*parametros*/int a,String nombre)
    {
        int n1=a;
        int n2=100;
        int suma=n1+n2;
        System.out.println(nombre+" has introducido el numero "+a);
        return suma;
    }

    /// void  método pero es un procedimiento
    // no tienen return
    public static void sumaProcedimiento(/*parametros*/int a,int b)
    {
        int n1=a;
        int n2=b;
        int suma=n1+n2;
        System.out.println(suma);
    }


    public static void main(String[] args)
    {
        int i = sumaFuncion(40,"Paulina");
        System.out.println(i);//90
        System.out.println(sumaFuncion(100,"Vicente"));
        sumaProcedimiento(500,-50);
    }
}
