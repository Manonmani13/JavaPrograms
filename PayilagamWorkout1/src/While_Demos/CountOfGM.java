package While_Demos;

public class CountOfGM {
	int count=0;
	public void count()
	{
		do
		{
			System.out.println("Good Morning");
			count=count+1;
			
		}while(count<5);
	}
	public static void main(String[] args) {
		CountOfGM gm=new CountOfGM();
		gm.count();
	}

}
