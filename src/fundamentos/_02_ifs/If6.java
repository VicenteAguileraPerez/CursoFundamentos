package fundamentos._02_ifs;

import java.util.Scanner;

public class If6
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float consumo;
        final float IVA =0.19f;
        float descuento;
        float impuestos;
        float importe;
        System.out.println("Introduce consumo: ");
        consumo = in.nextFloat();

        if(consumo<=100)
        {
            //100  costo antes de descue
            // 10  desc
            //90   costo con descuento
            //5    impuesto
            //95   importe
            //descuento de 10%
            descuento = consumo*0.10f;
            System.out.println("descuento: "+descuento);
            impuestos = (consumo-descuento)*IVA;
            System.out.println("impuestos: "+impuestos);
            importe =  consumo-descuento+impuestos;
            System.out.println("importe: "+importe);

        }
        else
        {
            //descuento del 20%
            descuento = consumo*0.20f;
            System.out.println("descuento: "+descuento);
            impuestos = (consumo-descuento)*IVA;
            System.out.println("impuestos: "+impuestos);
            importe =  consumo-descuento+impuestos;
            System.out.println("importe: "+importe);
        }
    }
}
