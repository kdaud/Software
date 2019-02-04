package LabAssignment;

import java.util.Scanner;

@SuppressWarnings("all")
public class Alphabet {
    public void OrdinalNumber() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character: ");
        
        char ch = scan.next().charAt(0);
        char res = Character.toLowerCase(ch);
		System.out.println("Character "+" Ordinal "+"    Binary ");
        if (res >= 'a' && res<='z') {

            int sc = (int) res - (int) 'a';

            int n=sc; 
            String h=" ";
            while(n>0)
			{
				int temp ;
				temp = n%2;
				h = temp+h;
				n = n/2;
			}
			System.out.println("    "+res+"         "+sc+"        "+h);
        }
        else if (res >= '0' && res <= '9')
        {
            int result = (int) res -(int)'0' +26 ;
            int y = result;
            String hb = " ";
            while(y>0)
			{
				int temp = y%2;
				hb = temp+hb;
				y=y/2;
			}
			System.out.println("    "+res+"         "+result+"        "+hb);
        }else {
            try {
            } catch (Exception ex){}
        }
        System.out.println("------------------------------------------");
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
                System.out.println("The alphabetic letter with Ordinal number "+i +" is : "+letter);
                return " "+ letter;
            }
            else {
                return toAlphabet(qout-1)+letter;
                
            }
            
        }
        
    }

}

