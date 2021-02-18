package fundamentos._04_fors;

public class For1
{
    /**
     * Programa que imprima los numeros del 1 al 10
     */
    public static void main(String[] args) {
        int i;
            //inicializacion   ;    condicion     ;   incremento o decremento
        for(      i=1      ;      i<=10       ;            i++)
        {
            //las sentencias a realizar
            System.out.println(i);
        }
        System.out.println("La i vale ahora fuera del for "+i);
        System.out.println("Termino el ciclo for");
        /**
         *   i=1                     true            1          2
         *   i=2                     true            2          3
         *   i=3                     true            3          4
         *   ....
         *   ...
         *   ...
         *   ...                                                9
         *   i=9                     true            9          10
         *   i=10                    true            10         11
         *   i=11                    false
         *   La i vale ahora fuera del for 11
         *   Termino el ciclo for
         */
    }
}
