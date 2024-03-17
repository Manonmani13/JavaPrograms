package String_method_29_10_21;

public class Reverse_att1 {
	
		public static void main(String[] args) {
			Reverse_att1 r=new Reverse_att1();
			String name ="manonmani pandukumar";
			char rev[]=r.reverse("manonmani");
			for(int i=0;i<rev.length;i++)
			{
			System.out.print(rev[i]+" ");
			}
			char rev1[]=r.reverse("pandukumar");
			for(int i=0;i<rev1.length;i++)
			{
			System.out.print(rev1[i]+" ");
			}
			
	}


public char[] reverse(String name)
{
	
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

	
		return key;
}
}
//i n a m n o n a m r a m u k u d n a p 