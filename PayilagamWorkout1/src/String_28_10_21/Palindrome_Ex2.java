package String_28_10_21;

public class Palindrome_Ex2 {
	public static void main(String[] args) {
		String name="malayalam";
		boolean pand=true;
		int i=0,j=name.length()-1;
		while(i<j)
		{
			if(name.charAt(i)!=name.charAt(j))
			{
				System.out.println("Not Palindrome");
				pand=false;
				break;
			}
			i++;
			j--;
		}
		if(pand)//pand==true use can also give pand are equal
		{
			System.out.println("Palimdrome");
		}
		
	}
}
//Palimdrome