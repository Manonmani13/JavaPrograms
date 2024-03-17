package Practice4;

public class Child2 extends Parent {
public static void main(String[] args) {
	Child2 ch=new Child2();
	ch.write();
	ch.read();
	Parent c=new Child2();
	c.write();
	//c.read();
}
public void read()
{
	
	System.out.println("read the concepts");
}
}
