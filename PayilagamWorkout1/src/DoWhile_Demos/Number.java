package DoWhile_Demos;

public class Number {
int n=2;
int no=4;
int n1=30;
int no1=10;

	void add()
	{
		do {
			
		
	System.out.println(n);
	n=n+no;
	no=no+2;
		}while(n<=30);
	}
	void reverse()
	{

		do {
			
		
	System.out.println(n1);
	n1=n1-no1;
	no1=no1-2;
		}while(n1>=2);
	}
	public static void main(String[] args) {
		Number n=new Number();
		//n.add();
		n.reverse();

	}

} 