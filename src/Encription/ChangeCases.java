package Encription;

import java.util.Scanner;

public class ChangeCases {
    public void myCase()
    {
        char ch;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Lower case character : ");
        ch = sc.next().charAt(0);
        temp = (int)ch;
        temp = temp-32;
        ch = (char)temp;
        System.out.println("Equivalent Character in Upper case = "+ch);
    }
}
