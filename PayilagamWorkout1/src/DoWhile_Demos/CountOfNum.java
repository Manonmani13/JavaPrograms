package DoWhile_Demos;

public class CountOfNum {
int count=0;
public void count()
{
	do
	{
		System.out.println("1");
		count=count+1;
	}while(count<5);
	
}
public static void main(String[] args) {
	CountOfNum no=new CountOfNum();
	no.count();
}
}
