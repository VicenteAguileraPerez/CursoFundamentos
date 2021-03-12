package fundamentos._01_intro_ejercicios;

public class _01_TiposDato_2
{
    public static void main(String[] args)
    {
        /**
         * byte   1B
         * short
         * int
         * long
         *
         * float   4   (f)(F)
         * double  8
         *
         * char
         *
         * boolean
         *
         *
         *
         * String TDNP
         */

         byte edad = 21;
         char s ='F';
         boolean trabaja = true;
         float peso = 49.25f;
         String nombre ="Paulina";
         long numero_grande =1500000;

        System.out.println("Hola, "+nombre);
        System.out.println("Eres "+s+" y pesas "+ peso +"kg y tienes una edad de "+edad+" años");
        System.out.println("trabajas?..."+trabaja);
        edad=22;
        System.out.println("El siguiente año cumples "+edad);

        final float IVA_MX = 0.16f;
        final float IVA_ES = 0.19f;
        float precio_pantalon_sin_IVA = 850;
        float precio_pantalon_con_IVA_MX = precio_pantalon_sin_IVA+precio_pantalon_sin_IVA*IVA_MX;
        float precio_pantalon_con_IVA_ES = precio_pantalon_sin_IVA+precio_pantalon_sin_IVA*IVA_ES;
        System.out.println("El pantalon cuesta "+precio_pantalon_con_IVA_MX+" pesos mexicanos");
        System.out.println("El pantalon cuesta "+precio_pantalon_con_IVA_ES+" euros");



        final float PI = 3.1415f;
        float radio=24.5f;
        //cast casting casteo refundicion de datos
        /*
            1 encerrar todo lo que se quiere caster entre ()
            2 ver que tipo de dato quieres convertir lo de paso 1
            3 escribir del lado izq de la expresion a cast el tipo de dato a convertir entre ()
         */

        float area = (float) (Math.PI*radio*radio);//150.1234567 80
        double area2 = Math.PI*radio*radio;//150.1234567 80
        System.out.println("El area del circulo es "+area+" unidades cuadradas");
        System.out.println("El area del circulo es "+area2+" unidades cuadradas");



    }
}
