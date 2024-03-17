package While_Demos;

public class Numbers {
	int no=4;
	int n1=30;
	int no1=10;
void add()
{
	int n=2,no=4;
	while(n<=30)
	{
		System.out.println(n);
		n=n+no;
		no=no+2;
	}
}
void reverse()
{

	while(n1>=2) {
		
	
System.out.println(n1);
n1=n1-no1;
no1=no1-2;
	}
}
public static void main(String[] args) {
	Numbers n=new Numbers();
	n.add();
	n.reverse();
}
}
