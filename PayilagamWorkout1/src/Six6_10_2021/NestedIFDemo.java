package Six6_10_2021;

public class NestedIFDemo {
	int time=9,day=4;
	public void demo() {
	if(day==4)
	{
		if(time==9)
		{
			System.out.println("Temple");
		}
		else {
			System.out.println("Office");
		}
	}
	if(day==5)
	{
		if(time==9)
		{
			System.out.println("Church");
		}
		else {
			System.out.println("Office");
		}
	}
	if(day==6)
	{
		if(time==9)
		{
			System.out.println("Mosque");
		}
		else {
			System.out.println("Office");
		}
	}
	}
	public static void main(String[] args) {
	NestedIFDemo ne=new NestedIFDemo();
	ne.demo();
}
}