package AccessModifiers;

public class StructureOfCode extends Access{
	static void m1()
	{
		System.out.println("hello");
	}
public static void main(String[] args) {
	m1();
}
}
/*public class Accces
{
	you cannot give public for classes in same file you will get error 
	you can declare above the way
}*/
class Access
{
 static void m1()
{
	System.out.println("hi");
}
	//if main method is not there we willget nosearch method error:
	//if class is noot there we will get no class found error
}
