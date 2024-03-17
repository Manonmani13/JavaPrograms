package Practice4;

public class Child3 extends Parent1 implements Monther{
public void depart()
{
	System.out.println("BSC");
}
public static void main(String[] args) {
	Child3 c=new Child3();
	c.depart();
}
}
