package DoWhile_Demos;

public class SixDigits {
int n=6,n1=6;
int ns=30,n2=6;
public void  digits()
{
	do
	{
		System.out.println(n);
		n=n+n1;
	}while(n<=30);
}
void reverse()
{
	while(ns>=6)
	{
		System.out.println(ns);
		ns=ns-n2;
	}
}
public static void main(String[] args) {
	SixDigits d=new SixDigits();
	d.digits();
	d.reverse();
}
}
