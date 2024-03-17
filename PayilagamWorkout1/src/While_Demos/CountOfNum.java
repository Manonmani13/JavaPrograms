package While_Demos;

public class CountOfNum {
int count=0;
public void count()
{
	while(count<5)
	{
		System.out.println("1");
		count=count+1;
		
	}
}
public static void main(String[] args) {
	CountOfNum no=new CountOfNum();
	no.count();
}
}
