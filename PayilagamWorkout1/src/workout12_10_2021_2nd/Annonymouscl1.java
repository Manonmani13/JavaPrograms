package workout12_10_2021_2nd;

public class Annonymouscl1 {
	//String name1,name2="mano","manonmani";
	String name1="mano";
	String name2="manonmani";
	public int add()
	{
		return 5;
	}
	public float sub()
	{
		return 5.2f;
	}
	void mult()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		int result=add();
	}
public static void main(String[] args) {
Annonymouscl1 c=new Annonymouscl1();	
c.mult();
c.add();
}
}
