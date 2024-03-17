package Array_22_10_21;

import java.util.Scanner;

public class Vowels_count {
public static void main(String[] args) {
	System.out.println("Enter your name");
	Scanner n=new Scanner(System.in);
	
	String name=n.nextLine();
	int c=0;
	for(int i=0;i<name.length();i++)
	{
		char cou=name.charAt(i);
		if((cou=='A'||cou=='E'||cou=='U'||cou=='I'||cou=='O')||
				(cou=='a'||cou=='e'||cou=='i'||cou=='o'||cou=='u'))
		{
			c++;
		}
		
	}
	System.out.println("Count is"+c);
}
}
