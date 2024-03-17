package LogicalPrograms_25_10_2021;

public class Palindrome_String {
public static void main(String[] args) {
	String lang="malayalam";//malayalam
	String rev="";
	int len=lang.length();
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+lang.charAt(i);
	}
	if(lang.equals(rev))
	{
		System.out.println("Panlindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
}
}
//Panlindrome