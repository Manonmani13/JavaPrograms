package MarkerInterface;

public class Test extends C {
public static void main(String[] args) {
	C c=new C();
	System.out.println(c.hashCode());
}
}
class P
{
	P()
	{
		System.out.println(this.hashCode());
	}
}
class C extends P
{
	C()
	{
		System.out.println(this.hashCode());
	}
}
