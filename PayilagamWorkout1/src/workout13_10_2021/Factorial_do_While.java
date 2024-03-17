package workout13_10_2021;

public class Factorial_do_While {
public static void main(String[] args) {
	int count=5;
	do
	{
		int fact=1;
		int n=1;
		do
		{
			fact=fact*n;
			n++;
		}while(n<=count);
		System.out.println(fact);
		count--;
	}while(count>=1);
}
}
