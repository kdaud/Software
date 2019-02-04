package LabAssignment;

@interface KakumiriziDaud
{ String name() default " ";String idNo() default " ";}

@KakumiriziDaud(name = "Kakumirizi Daud", idNo = "17/BSS/BU/R/0010")
@SuppressWarnings("all")
public class Main {
    /**
     * @Main: this is a main method from which objects are created
     * @param args
     * @course Information security
     * @email davidmandy92@gmail.com
     */
    public static void main(String[] args) {

        Alphabet alpha = new Alphabet();
        /**
         * this method prompts the user to enter a character of a-z or
         * 0-9
         * Otherwise the program throws an exception with message info
         * ["Enter a valid character"]

         */
        alpha.OrdinalNumber();
        /**
        this method returns the character that
        occupies the ordinal entered by the user
        */
        alpha.toAlphabet(10);
        ClassA.read();
        



    }
}
