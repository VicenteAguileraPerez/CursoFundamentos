package fundamentos._03_switch;

import java.util.Scanner;

public class Sw2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        int c;
        int d;
        int u;
        int n;
        //MCDU
        //3221          -->     MMMCMXCIX
        //                             9      8      7    6    5    4    3     2     1
        /*3221 /1000 = 3                                                 MMM   MM    M
         * 221 /100  = 2               CM    DCCC   DCC  DC    D   CD   CCC    CC    C
         *  21 /10   = 2               XC    LXXX   LXX  LX    L   XL   XXX    XX    X
         *   1                         IX    VIII   VII  VI    V   IV   III    II    I
         */
        System.out.println("Introduce numero decimal: ");
        n=in.nextInt();
        m=n/1000;
        n=n%1000;

        c=n/100;
        n=n%100;

        d=n/10;

        u=n%10;
        //System.out.println(m);
        //System.out.println(c);
        //System.out.println(d);
        //System.out.println(u);
        String romano = "";
        switch (m)
        {
            case 1:
                romano="M";
                break;
            case 2:
                romano="MM";
                break;
            case 3:
                romano="MMM";
                break;
        }

        switch (c)
        {
            case 1:
                romano=romano+"C";
                break;
            case 2:
                romano=romano+"CC";
                break;
            case 3:
                romano=romano+"CCC";
                break;
            case 4:
                romano=romano+"CD";
                break;
            case 5:
                romano=romano+"D";
                break;
            case 6:
                romano=romano+"DC";
                break;
            case 7:
                romano=romano+"DCC";
                break;
            case 8:
                romano=romano+"DCCC";
                break;
            case 9:
                romano=romano+"CM";
                break;
        }

        switch (d)
        {
            case 1:
                romano=romano+"X";
                break;
            case 2:
                romano=romano+"XX";
                break;
            case 3:
                romano=romano+"XXX";
                break;
            case 4:
                romano=romano+"XL";
                break;
            case 5:
                romano=romano+"L";
                break;
            case 6:
                romano=romano+"LX";
                break;
            case 7:
                romano=romano+"LXX";
                break;
            case 8:
                romano=romano+"LXXX";
                break;
            case 9:
                romano=romano+"XC";
                break;
        }
        switch (u)
        {
            case 1:
                romano=romano+"I";
                break;
            case 2:
                romano=romano+"II";
                break;
            case 3:
                romano=romano+"III";
                break;
            case 4:
                romano=romano+"IV";
                break;
            case 5:
                romano=romano+"V";
                break;
            case 6:
                romano=romano+"VI";
                break;
            case 7:
                romano=romano+"VII";
                break;
            case 8:
                romano=romano+"VIII";
                break;
            case 9:
                romano=romano+"IX";
                break;
        }
        System.out.println(romano);

    }
}
