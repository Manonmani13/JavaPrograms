package Practice8_10_2021;

public class Prime2 {
	int n=15;
	int i=2;
	void prime()
	{
		while(i<n)
		{
			if(n%i==0)
			{
				System.out.println("not prime");
				break;
			}
			i=i+1;
		}
	}
	public static void main(String[] args) {
		Prime2 p=new Prime2();
		//System.out.println("not prime");
		p.prime();
	}
}
