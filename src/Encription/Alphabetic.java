package Encription;

public class Alphabetic {
    public void printAlphabet()
    {
        char ch;
        int ts;
        for(ch = 'A';ch<='z';ch++)
        {
            System.out.print((ch)+" ");
        }
        ts=0;
        while (ts<=9)
        {
            System.out.print(ts+" ");
            ts++;
        }
        System.out.println();
    }
    @Deprecated
    public void printCountingNo()
    {
        int x =0;
       while (x<10){
           System.out.println("Completed value of x: "+x);
           x++;
       }
    }
    public  String charecter(int i)
    {
        if(i<0)
        {
            System.out.println(i);
            return "-"+charecter(-i-1);
        }
        int quot = i/26;
        int rem = i%26;
        char letter =(char)((int)'A'+rem);
        if(quot==0){
            System.out.println("Completed call: "+letter);
            return ""+letter;
        }
        else {
            return " "+charecter(quot-1)+letter;
        }
    }
}
