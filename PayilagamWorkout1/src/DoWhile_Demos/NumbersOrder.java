package DoWhile_Demos;

public class NumbersOrder {
int no=1;
void numcount()
{
	do
	{
		System.out.println(no+" ");
		no=no+1;
	}while(no<=5);
}
public static void main(String[] args) {
	NumbersOrder no=new NumbersOrder();
	no.numcount();
}
}
