package LabAssignment;

public class ClassA {
	public static void read()
	{
		System.out.println("Character "+" Ordinal "+"    Binary ");
		for(char c='A';c<='Z';c++)
		{
			char ss = Character.toLowerCase(c);
			int ff = (int)ss-(int)'a';
			int x=ff;
			
			String h=" ";
			while (x>0){
					int temp = x%2;
					h = temp+h;
					x = x/2;
			}
			System.out.println("    "+ss+"         "+ff+"        "+h);
		}
		for(char cx='0';cx<='9';cx++)
		{
			char cd = Character.toLowerCase(cx);
			int fx = ((int)cd-(int)'0')+26;
			int tx =fx;
			int h;
			String hb = " ";
			while(tx>0)
			{
				h = tx%2;
				hb = hb+h;
				tx =tx/2;
			}
			System.out.println("    "+cd+"         "+fx+"        "+hb);
		}
	}
}
