package DoWhile_Demos;

public class Sum {
int sum=0,n=50;
void check()
{
	do
	{
		sum=sum+n;
		
	}while(sum!=0);
	System.out.println(n);
	
}
public static void main(String[] args) {
	Sum s=new Sum();
	s.check();
}
}
