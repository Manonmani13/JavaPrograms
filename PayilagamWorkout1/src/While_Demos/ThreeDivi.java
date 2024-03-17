package While_Demos;

public class ThreeDivi {
	int no=1;
	void divi()
	{
		while(no<=9)
		{
			System.out.println(no);
			no=no+2;
		}
	}
	public static void main(String[] args) {
		ThreeDivi  td=new ThreeDivi();
		td.divi();
	}
}
