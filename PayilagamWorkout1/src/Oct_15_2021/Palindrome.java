package Oct_15_2021;

public class Palindrome {
	public static void main(String[] args) {
		int n=202,r,sum=0,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
		System.out.print("palindrome number");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
