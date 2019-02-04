package Encription;

import java.util.Scanner;

public class Cases {
    public void run()
    {
        char ch;
        int temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Uppercase letter :");
        ch = sc.next().charAt(0);

        temp =  (int)ch;
        temp = temp+32;

        ch = (char)temp;
        System.out.println("The completed uppercase letter is : " +ch);

    }
}
