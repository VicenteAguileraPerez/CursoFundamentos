package fundamentos._03_switch;

import java.util.Scanner;

public class Sw3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short dec;
        short u,d,c,m;
        String romano="";
        //3241 MMMCCXLI
        System.out.println("Decimal: ");
        dec = in.nextShort();
        m = (short) (dec/1000);//3 MMM 2MM 1M
        dec%=1000;//241
        c = (short) (dec/100);//2  9=CM 8=DCCC 7=DCC 6=DC  5=D  4=CD 3=CCC 2=CC 1C
        dec%=100;//41
        d = (short) (dec/10);//4   9=XC 8=LXXX 7=LXX 6=LX   5=L  4=XL 3=XXX 2=XX 1=X
        u=(short) (dec%10);//1     9=IX 8=VIII 7 =VII 6=VI 5=V  4=IV 3=III 2=II 1=I

        switch (m)
        {
            case 3:
                romano="MMM";
                break;
            case 2:
                romano="MM";
                break;
            case 1:
                romano="M";
                break;
        }
        switch (c)
        {
            case 9:
                romano+="CM";//roma=roma+"CM"
                break;
            case 8:
                romano+="DCCC";
                break;
            case 7:
                romano+="DCC";
                break;
            case 6:
                romano+="DC";
                break;
            case 5:
                romano+="D";
                break;
            case 4:
                romano+="CD";
                break;
            case 3:
                romano+="CCC";
                break;
            case 2:
                romano+="CC";
                break;
            case 1:
                romano+="C";
                break;
        }
        switch (d)
        {
            case 9:
                romano+="XC";//roma=roma+"CM"
                break;
            case 8:
                romano+="LXXX";
                break;
            case 7:
                romano+="LXX";
                break;
            case 6:
                romano+="LX";
                break;
            case 5:
                romano+="L";
                break;
            case 4:
                romano+="XL";
                break;
            case 3:
                romano+="XXX";
                break;
            case 2:
                romano+="XX";
                break;
            case 1:
                romano+="X";
                break;
        }
        switch (u)
        {
            case 9:
                romano+="IX";//roma=roma+"CM"
                break;
            case 8:
                romano+="VIII";
                break;
            case 7:
                romano+="VII";
                break;
            case 6:
                romano+="VI";
                break;
            case 5:
                romano+="V";
                break;
            case 4:
                romano+="IV";
                break;
            case 3:
                romano+="III";
                break;
            case 2:
                romano+="II";
                break;
            case 1:
                romano+="I";
                break;
        }

        if(romano.equals("")) // ==  !=
        {
            System.out.println("Romano es: 0");
        }
        else
        {
            System.out.println("Romano es: "+romano);
        }

    }
}
