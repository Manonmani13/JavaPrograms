package String_28_10_21;

public class Palindrome_Ex1 {
public static void main(String[] args) {
	String name="malay";
	int i=0,j=name.length()-1;
	while(i<j)
	{
		if(name.charAt(i)!=name.charAt(j))
		{
			System.out.println("Not Palindrome");
			break;
		}
	}
}
}
//Not Palindrome