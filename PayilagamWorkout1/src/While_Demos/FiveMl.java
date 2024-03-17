package While_Demos;


public class FiveMl {
	int no=5;
	void fives()
	{
		do
		{
			System.out.println(no);
			no=no+5;
		}while(no<=25);
	}
	public static void main(String[] args) {
		FiveMl f=new FiveMl();
		f.fives();
	}
}
