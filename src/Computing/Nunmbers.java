package Computing;

import java.util.Scanner;

public class Nunmbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        int y = ((int)ch -(int)'0')+26;
        System.out.println(y);
    }
}
