package Practice8_10_2021;

public class PrimefullPro {
	int n=5;
	int i=2; 
	boolean not_prime=true;
	void prime()
	{
		while(i<n)
		{
			if(n%i==0)
			{
				//System.out.println("not prime");
				 not_prime=false;
				break;
			}
			i=i+1;
		}
		if(not_prime==false)
		{
			System.out.println("Not Prime ");
		}
		else
		{
			System.out.println("Prime Number");
		}
	}
	public static void main(String[] args) {
		PrimefullPro p=new PrimefullPro();
		p.prime();
	}
}
