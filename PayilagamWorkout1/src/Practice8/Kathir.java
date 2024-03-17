package Practice8;

public class Kathir extends Foodlist implements Emp, Fam{
	final String name="kathir";
	public void wear()
	{
	System.out.println("wear neet dress");
	}
	public void dosomething()
	{
		System.out.println("Do your work");
	}
	public void applyLeave()
	{
		System.out.println("apply leave");

	}
	public static void main(String args[])
	{
	Kathir k=new Kathir();
	System.out.println(Kathir.leaves);

	Emp.jj();
	k.foodlist();
	k.wear();
	System.out.println(k.name);
	
	}
}
