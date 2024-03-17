package Program_Practie_9_11_21;

public class Patter_30C {
public static void main(String[] args) {
	char ch='A';
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(ch+" ");
			if(ch<'Z')
			{
				ch++;
			}
			else
			{
				ch=(char)'A';
			}
			
		}System.out.println();
		
	}
}
}
/*
A B C D E 
F G H I J 
K L M N O 
P Q R S T 
U V W X Y 

*/