package Oct_14_2021;

public class ReverseNo1 {
public static void main(String[] args) {
	int n=234564,r=0;
	for(;n!=0;n=n/10)
	{
		int rem=n%10;
		r=r*10+rem;
	}
	System.out.println(r);
}
}
