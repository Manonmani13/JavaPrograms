package Oct_14_2021;

public class ReverseNo {

public static void main(String[] args) {
	int n=98756,rev=0;
	while(n!=0)
	{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println("reverse no \t"+rev);
}

}
