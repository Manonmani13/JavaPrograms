package String_method_29_10_21;

public class Palindrome {
	public static void main(String[] args) {
		String name ="manonmani pandukumar";
		char key[]=name.toCharArray();
		int i=0,j=name.length()-1;
		while(i<j)
		{
			char temp=key[i];
			key[i]=key[j];
			key[j]=temp;
			i++;
			j--;
			
		}
		for(i=0;i<key.length;i++)
		{
			System.out.print(key[i]+" ");
		}
			String name2=new String(key);
			System.out.println(name2);
			if(name.equals(key))
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("Not palindrome");
			}
	}
}
/*
r a m u k u d n a p   i n a m n o n a m ramukudnap inamnonam
Not palindrome
*/