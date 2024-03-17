package Oct_15_2021;

public class Reverse {
public static void main(String[] args) {
	int n=23432,r = 0;
	while(n!=0)
	{
		r=r*10;
		r=r+n%10;
		n=n/10;
	}
	System.out.print(r);
}
}
