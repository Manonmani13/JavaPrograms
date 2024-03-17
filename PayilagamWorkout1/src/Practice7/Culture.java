package Practice7;

public class Culture extends Cul {
public void welcome()
{
	System.out.println("vanakam");
}
public static void main(String[] args) {
Culture b=new Culture();
b.welcome();
b.wear();
}
}
abstract class Cul
{
	public abstract void welcome();
	public void wear()
	{
		System.out.println("Wear treaditional dress");
	}
}