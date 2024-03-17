package Practice8_10_2021;

public class Prime1 {
int n=15;
int i=2;
void prime()
{
	while(i<n)
	{
		if(n%i==0)
		{
			System.out.println("not prime");
			i=i+1;
		}
	}
}
public static void main(String[] args) {
	Prime1 p=new Prime1();
	System.out.println("not prime");
	p.prime();
}
}
