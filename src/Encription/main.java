package Encription;

@interface KakumiriziDaud
{
    String name() default " ";
    String id() default " ";
    String email() default " ";

}
@KakumiriziDaud(name = "Kakumirizi Daud",
        id = "17/BSS/BU/R/0010",
        email = "davidmandy92@gmail.com")
public class main {
    /**
     * @this is the main method where objected are created and their behaviors are invoked
     * @Author Kakumirizi Daud
     * @Version 1.8.0.1
     * @since 2017
     * @University [Bugema University]
     * @Department {Information and Technology}
     */
    public static void main(String[] args) {
        Alphabetic alpa = new Alphabetic();
        alpa.printAlphabet();
        Alphabetic apl = new Alphabetic();
        apl.charecter(0);
        //alpa.printCountingNo();

        ChangeCases cc = new ChangeCases();
        cc.myCase();

    }
}
