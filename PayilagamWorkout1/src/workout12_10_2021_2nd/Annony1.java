package workout12_10_2021_2nd;

public class Annony1 {
public static void main(String[] args) {
person p=new person()
{
	void eat()
	{
		System.out.println("nice fruits");
	}
};
p.eat();
}
}
abstract class person
{
	abstract void eat();
}