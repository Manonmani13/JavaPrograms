package While_Demos;



public class Sum {
	int sum=0,n=50;
	void check()
	{
		while(sum!=0)
		{
			sum=sum+n;
			
		}
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		Sum s=new Sum();
		s.check();
	}
}
