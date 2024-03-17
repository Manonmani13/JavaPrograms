package Practice8;
class Sasi
{
	public void watchNews()
	{
		System.out.println("watch tv news");
	}
	public void takerest()
	{
		System.out.println("Take REst");
	}
	
}
public class Friend extends Sasi {
	public void watchNews()
	{
		System.out.println("Social media");
	}
	
public static void main(String[] args) {
	Friend d=new Friend();
	d.watchNews();
	d.takerest();
}
}
