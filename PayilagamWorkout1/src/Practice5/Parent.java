package Practice5;

public class Parent extends Gparent{
	int j=100;
	public void wel()
	{
		System.out.println(super.j);
		System.out.println(this.j);
		System.out.println("welcome from parent"+j);
	}
}
