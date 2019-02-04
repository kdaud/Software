package Encription;

import Computing.MyFinalGpa;

import java.util.Scanner;

public class MyApp {
    static String department;
    static
    {
        department = "Information and Technology";
        System.out.println("This is "+department+" department");
    }
    private static Scanner scan;
    public static void draw()
    {
        scan = new Scanner(System.in);
        String ds = scan.nextLine();
        char []ch = ds.toCharArray();
        for(char ss : ch)
        {
            System.out.printf("%c",ss);;
        }
    }
    public String computerScience()
    {
        int x = scan.nextInt();
        int y = scan.nextInt();
        x =x+y;
        y = x-y;
        x = x-y;
        System.out.println("The value of x is : "+x);
        System.out.println("The value of x is : "+y);
        return computerScience();
    }
    public static void main(String [] args)
    {
        MyApp.draw();

    }
}
