package While_Demos;

public class NumbersOrder {
	int no=1;
	void numcount()
	{
		while(no<=5)
		{
			System.out.println(no+" ");
			no=no+1;
		}
	}
	public static void main(String[] args) {
		NumbersOrder no=new NumbersOrder();
		no.numcount();
	}
}
