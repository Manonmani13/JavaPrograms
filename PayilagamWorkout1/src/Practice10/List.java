package Practice10;

public class List extends Go {
public static void main(String[] args) {
	List ls=new List();
	ls.help();
}
public Go help()
{
	Go g=new Go();
	System.out.println("help");
	return g;
}
}
class Go
{
	public Go help()
	{
		System.out.println("help from Go");
		return null;
	}
}