package Assignment;

public class Demo {
	public static void show(){
		for(int i=12;i<=22;i+=2)
		{
			System.out.println("Complected call: "+i);
		}
		for(char ch ='a';ch<='h';ch++){
			System.out.println("Completed call: "+ch);
		}
	}

	public static void main(String[] args) {
		Demo.show();
	}
}
