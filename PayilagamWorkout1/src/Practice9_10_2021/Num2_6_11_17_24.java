package Practice9_10_2021;

public class Num2_6_11_17_24 {
	//2+4=6 6+5=11 11+6=17 17+7=24
	int n=2,i=4;
	
	void Num()
	{
		while(n<=24)
		{
			System.out.println(n);
			n=n+i;
			i++;
		}
		/*
		 System.out.print(n+" ");
		n=n+4;
		System.out.print(n+" ");
		n=n+5;
		System.out.print(n+" ");
		n=n+6;
		System.out.print(n+" ");
		n=n+7;
		System.out.print(n+" ");
		 */
	}
public static void main(String[] args) {
	Num2_6_11_17_24 n=new Num2_6_11_17_24();
	n.Num();
}
}
