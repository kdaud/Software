package Computing;

public class MyFinalGpa {
    public static void main(String[] args) {
result();
double fr = 107;
double rf =fr/22;
        Resulting ts = new Resulting();
        ts.show();
    }
    public static double result()
    {

        double s1, s2,s3,s4,s5,s6,s7,rs;
        s1 =3*4.5;
        s2=4.5*3;
        s3 =3*5;
        s4 = 3*5;
        s5 = 3*5;
        s6= 3*5;
        s7 = 4*5;
        rs = s1+s2+s3+s4+s5+s6+s7;
        double finals = rs/22;
        System.out.println("My final Grade is : "+finals);

        return finals;
    }
}
class Resulting
{
    public void show()
    {
        double r1 = 84+105+107;
        double f4 = r1/(19+21+22);
        System.out.println("The GPA as per January 2019 is "+f4);
    }
}