package Oct_15_2021;

public class PrimeNo1 {
public static void main(String[] args) {
	int i=2,n=6;
	boolean b=false;
	while(i<n)
	{
		if(n%i==0)
		{
			b=true;
			break;
		}
		i++;
	}
	if(b==false)
	{
		System.out.println(" prime no  "+n);
	}
	else
	{
		System.out.println("Not prime no"+n);
	}
}
}
