package Practice8_10_2021;

public class ThreeTables {
	int n=1;
	void two()
	{
		do
		{
			
			if(n%3==0)
			{
				System.out.println(n);
			}
			n++;
		}while(n<=12);
	}
	public static void main(String[] args) {
		ThreeTables d=new ThreeTables();
		d.two();
	}
}
