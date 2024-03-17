package DoWhile_Demos;

public class FivesMul {
int no=5;
void fives()
{
	do
	{
		System.out.println(no);
		no=no+5;
	}while(no<=25);
}
public static void main(String[] args) {
	FivesMul f=new FivesMul();
	f.fives();
}
}
