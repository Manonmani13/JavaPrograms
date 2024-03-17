package DoWhile_Demos;

import While_Demos.Freequence;

public class Freequency {
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
		Freequency f=new Freequency();
		f.freequency();
	}
}
