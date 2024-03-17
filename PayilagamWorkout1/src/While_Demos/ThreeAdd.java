package While_Demos;


public class ThreeAdd {
	int no=1;
	void three()
	{
		while(no<=13)
		{
			System.out.println(no);
			no=no+2;
		}
	}
	public static void main(String[] args) {
		ThreeAdd ad=new ThreeAdd();
		ad.three();
	}
}
