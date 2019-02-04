package Computing;

public class Fix {
    public void run(){
        char hc ;
        for(hc ='A';hc<='Z';hc++){
            int res = (int)hc;
            System.out.println(hc+" = "+res);
        }
    }
    public static void main(String[] args) {
        Fix fx = new Fix();
        fx.run();
    }
}
