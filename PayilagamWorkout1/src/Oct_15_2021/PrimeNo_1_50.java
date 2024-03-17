package Oct_15_2021;

public class PrimeNo_1_50 {
public static void main(String[] args) {
int n=2,p=0;
	
	while(n<=100)
	{
		int i=2;
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
		p=p+1;
		System.out.println(n);
		if(p==20)
		{
			break;
		}
	}
	
	else
	{
		//System.out.println("Not prime no"+n);
	}
	n++;
	}
}
}
