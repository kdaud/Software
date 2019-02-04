package Computing;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

public class Monday {
    public void test(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char ch = sc.next().charAt(0);
        char sd = Character.toLowerCase(ch);
        System.out.println(sd);
    }

    public static void main(String[] args) {
        Monday md = new Monday();
        md.test();
    }
}
