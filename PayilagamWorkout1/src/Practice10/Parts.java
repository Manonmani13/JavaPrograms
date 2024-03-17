package Practice10;
class Car
{
	public void color()
	{
		System.out.println("red");
	}
}
public class Parts extends Car{
public static void main(String[] args) {
	Parts p=new Parts();
	p.color();
}

}
