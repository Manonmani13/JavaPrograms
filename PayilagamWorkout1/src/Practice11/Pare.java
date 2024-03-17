package Practice11;
abstract class Gp
{
	abstract void Tshirt();
	public void cloths()
	{
	System.out.println("Vesti");
	}
}
public class Pare extends Gp {
public static void main(String[] args) {
	Pare p=new Pare();
	p.cloths();
	p.Tshirt();
}
void Tshirt()
{
	System.out.println("wear t shir");
}
}
