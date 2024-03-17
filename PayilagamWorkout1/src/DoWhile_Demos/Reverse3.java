package DoWhile_Demos;

public class Reverse3 {
	int no=13;
	void rev()
	{
		do
		{
			System.out.println(no);
			no=no-3;
		}while(no>=1);
	}
	public static void main(String[] args) {
		Reverse3 r=new Reverse3();
		r.rev();
	}
}
