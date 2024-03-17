package Six6_10_2021;

public class AgeAndWeight {
	int age=20;
	int weight=80;
	public void cond()
	{
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("you are eligible to dontate blood");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeAndWeight aw=new AgeAndWeight();
		aw.cond();

	}

}
