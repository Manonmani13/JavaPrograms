package DoWhile_Demos;

public class CountingNum {
	int n=2;
	int c=0;
	void freequency()
	{
		while(n<=12)
		{
			System.out.println(n);
			c=c+1;
			if(c==3)
			{
				n=n+2;
				System.out.println(n);
			}
			n++;
		}
	}
	public static void main(String[] args) {
		CountingNum n=new CountingNum();
		n.freequency();
		
	}
}
