package Interview_prac_30_10_21;

public class Character_count {
public static void main(String[] args) {
	String wor="hello welcome";
	int co=0;

	for(int i=0;i<wor.length()-1;i++)
	{
		if(wor.charAt(i)!=' ')
		{
			co++;
		}
	
	}
	System.out.println("count"+co);
}
}
//count11