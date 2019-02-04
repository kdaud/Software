package Computing;

import com.sun.javafx.binding.StringFormatter;

import java.util.Scanner;

@interface Mandy {
    String name() default "null";

    String idNo() default " ";
}
@Mandy(name = "KaKUMIRIZI DAUD", idNo = "17/BSS/BU/R/0010")
public class Chryptography {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(StringFormatting(s));
    }
    public static String StringFormatting(String s){
        StringBuffer sb = new StringBuffer();
        for(int i =0; i<sb.length();i++)
        {
            char c = s.charAt(i);
            if(i%2==0){
                if(c==122)
                c=(char)(c-25);
                else
                {
                    c = (char)(c+1);
                }
                sb.append(c);
            }
            else {

                sb.append(c);
            }
        }
        System.out.println();
return sb.toString();
    }
}
