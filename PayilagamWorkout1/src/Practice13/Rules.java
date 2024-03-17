package Practice13;

public class Rules {
public Rules()
{
	System.out.println("Default constru with public");
}
private Rules(int n) {
	System.out.println("Constructor with private");
}
protected Rules(String t)
{
	System.out.println("Constructor  with protected");
}
Rules(float f)
{
System.out.println("constructor with default");
}

public static void main(String[] args) {
	Rules s=new Rules();
	Rules e=new Rules(10);
	Rules w=new Rules("mano");
	Rules s1=new Rules(10.0f);
}
}
