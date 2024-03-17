package While_Demos;

public class Freequence {
int n=2;
void freequency()
{
	while(n<=12)
	{
		
		if(n==7||n==5||n==11)
		{
			n=n+1;
			System.out.println(n);
		}
		else
		{
			System.out.println(n);
		}
		n++;
	}
}
public static void main(String[] args) {
	Freequence f=new Freequence();
	f.freequency();
}
}
