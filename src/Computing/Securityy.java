package Computing;

import java.util.Scanner;

public class Securityy {
    public static void main(String[] args) {

        for(char sc ='A'; sc<='z'; sc++)
        {
            int num = (int)sc;
            System.out.print(sc+" ");
            System.out.println(num);
        }
        System.out.println();
        int y=0;
        while (y<10){
            System.out.print(y+" ");
            y +=1;
        }

        int nm = 65;
        char sd = (char)nm;
        System.out.println(sd);
        toAlphabet(20);
    }
    public static String toAlphabet(int i)

    {
        if(i<0){
            return "-"+toAlphabet(-i-1);
        }
        else {
            int qout = i/26;
            int rem = i%26;
            char letter = (char)((int)'A'+rem);
            if (qout==0){
                System.out.println("Retern "+letter);
                return " "+ letter;
            }
            else {
                return toAlphabet(qout-1)+letter;
            }
        }
    }
    public static int toOrdinalNum(String s){
        char sc ='f';
       return sc;
    }
}
