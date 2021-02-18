package fundamentos._04_fors;

public class For6
{
    public static void main(String[] args)
    {
        /**
         * imprima valores de 10 al 1
         * imprima los multiplos de 2 desde 20 hasta -20
         * imprima los impares   30  hasta 1
         */
        int i;
        for(      i=10     ;      i>=1      ;            i--)
        {
            //las sentencias a realizar
            System.out.println(i);
        }
        System.out.println("multiplos de 2");
        for(      i=20     ;      i>=-20      ;            i=i-2/* i-=2  */)
        {
            //las sentencias a realizar
            //if(i%2==0) {
                System.out.println(i);
            //}
        }
        System.out.println("impares");
        for(i=30-1;i>=1;i=i-2)
        {
            System.out.println(i);
        }
    }
}
