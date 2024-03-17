package Practice4;

public class Child {
Child()
{
System.out.print("default constructor\n");	
}
Child(int i)
{ this();
	System.out.print(i);
}
public static void main(String[] args) {
	Child h=new Child(10);
}
}
