package DoWhile_Demos;

public class NumberDis {
int n=6;

void sixde()
{
	do
	{
		System.out.println(n);
		n=n*2;
	}while(n<=30);
}
public static void main(String[] args) {
	NumberDis ds=new NumberDis();
	ds.sixde();
}
}
