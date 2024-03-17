package Six6_10_2021;

public class NestedCondi {
	int age=20;
	int weight=40;
	public void cond()
	{
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("you are eligible to dontate blood");
			}
			else
			{
				System.out.println("you are not eligible to dontate blood");
			}
		}
		else
		{
			System.out.println("Age must be greater than 18");  
		}
	}
	public static void main(String[] args) {
		NestedCondi c=new NestedCondi();
		c.cond();
	}
}
