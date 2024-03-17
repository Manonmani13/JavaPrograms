package Practice9_10_2021;

public class Pro11_13_17_23 {
int n=11;
void pro()
{
	int c=0;
	
	while(n<=23)
	{
		if(c==2||c==4)
		{
			n=n+c;
			System.out.println(n);
		}
		else
		{
			System.out.println(n);
		}
		n=n+2;
		c++;
	}
}
public static void main(String[] args) {
	Pro11_13_17_23 s=new Pro11_13_17_23();
	s.pro();
}
}
