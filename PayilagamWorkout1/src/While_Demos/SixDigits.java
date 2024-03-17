package While_Demos;



public class SixDigits {
	int n=6,n1=6;
	int ns=30,n2=6;
	public void  digits()
	{
		while(n<=30)
		{
			System.out.println(n);
			n=n+n1;
		}
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
