package String_28_10_21;

public class ToCharArray_Ex1 {
public static void main(String[] args) {
	String name="Manonmani Pandukumar";
	System.out.println(name.length());
	char ch[]=name.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]+" ");	
	}
	
}
}
//M a n o n m a n i   P a n d u k u m a r 