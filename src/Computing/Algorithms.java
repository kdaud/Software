package Computing;

import java.util.Scanner;

@interface Kakumirizi{
    String email();
}
@Kakumirizi(email = "dkakumirizii@gmail.com")
public class Algorithms {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Daud Kakumirizi!");
        sb.append(" You are are  welcome to Open Source World of Technology");
        System.out.println(sb);

        char cs = 'u';
        int dev = (int)cs;
        System.out.println("The ASCII Code for the character u is : "+dev);

        credintials();
    }
    public static String credintials(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String email = sc.nextLine();
        if(email.contains("@"))
        {
            System.out.println("Name: "+name +" Email Address: "+email);
        }
        else
        {
            System.out.println("Invalid Email");
        }
        return name;
    }
}
