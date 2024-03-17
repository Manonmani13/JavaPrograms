package Oct_15_2021;

public class PrimenNo_1_20 {
public static void main(String[] args) {
	int n=2;
	
	while(n<=20)
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
		System.out.println(n);
	}
	else
	{
		//System.out.println("Not prime no"+n);
	}
	n++;
	}
}
}

