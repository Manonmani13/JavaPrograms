package Oct_15_2021;

public class Fibno_Prime_No {
void fibo()
{
	int f=1,s=0,t,n=1;
	while(n<=20)
	{
		t=f+s;
		//System.out.println(t);
		prime(t);
		f=s;
		s=t;
	}
}
boolean prime(int t)
{

	
		int i1=2;
		boolean b=false;
		if(t>=2)
		{
	while(i1<t)
	{
		if(t%i1==0)
		{
			b=true;
			break;
		}
		i1++;
		
	}
		}
	if(b==false)
	{
		
		System.out.println(t);
		
	}
	
	else
	{
		//System.out.println("Not prime no"+n);
	}
	return b;
	
}
public static void main(String[] args) {
	Fibno_Prime_No n=new Fibno_Prime_No();
	n.fibo();
}
}
