package Practice7;
abstract class Honda
{
	public abstract void mileage();
}
class Activa extends Honda
{
	public void mileage()
	{
		System.out.println("hello");
	}
}
public class Dio  extends Activa{
public static void main(String[] args) {
	Dio d=new Dio();
	d.mileage();
}
}
