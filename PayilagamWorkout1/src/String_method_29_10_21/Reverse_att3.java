package String_method_29_10_21;

public class Reverse_att3 {
	public static void main(String[] args) {
		Reverse_att1 r=new Reverse_att1();
		String name ="manonmani pandukumar";
		char rev[]=r.reverse("manonmani");
		String revna=new String(rev);
		char rev1[]=r.reverse("pandukumar");
		String revna1=new String(rev1);
		String reverseall=revna+revna1;
		//System.out.println(reverseall);
	char []finalar=reverse(reverseall);
	System.out.println(finalar);
		
}
public static char[] reverse(String name)
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
//pandukumarmanonmani