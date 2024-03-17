package String_method_29_10_21;

public class Reverse_String {
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
			
}
}
//r a m u k u d n a p   i n a m n o n a m 