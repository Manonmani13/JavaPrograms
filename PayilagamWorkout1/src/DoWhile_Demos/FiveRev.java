package DoWhile_Demos;


public class FiveRev {
	int no=25;
	void rev()
	{
		do
		{
			System.out.println(no);
			no=no-5;
		}while(no>=5);
	}
	public static void main(String[] args) {
		FiveRev r=new FiveRev();
		r.rev();
	}
}
