package While_Demos;


public class Reverse {
	int no=5;
	void reverse()
	{
		while(no>=1)
		{
			System.out.println(no);
			no=no-1;
		}
	}
	public static void main(String[] args) {
		Reverse rs=new Reverse();
		rs.reverse();
	}
}
