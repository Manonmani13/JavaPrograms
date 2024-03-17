package Practice8_10_2021;

public class TwoTables {
int n=2;
void two()
{
	do
	{
		
		if(n%2==0)
		{
			System.out.println(n);
		}
		n++;
	}while(n<=12);
}
public static void main(String[] args) {
	TwoTables t=new TwoTables();
	t.two();
}
}
