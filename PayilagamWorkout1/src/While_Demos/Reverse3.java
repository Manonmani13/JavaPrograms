package While_Demos;


public class Reverse3 {
	int no=13;
	void rev()
	{
		while(no>=1)
		{
			System.out.println(no);
			no=no-3;
		}
	}
	public static void main(String[] args) {
		Reverse3 r=new Reverse3();
		r.rev();
	}
}
