package workout13_10_2021;

public class Factorial_while1 {
	public static void main(String[] args) {
		int count=5;
		while(count>=1)
		{
			int fact=1;
			int n=1;
			while(n<=count)
			{
				fact=fact*n;
				n++;
			}
			System.out.println(fact);
			count--;
		}
	}
}
