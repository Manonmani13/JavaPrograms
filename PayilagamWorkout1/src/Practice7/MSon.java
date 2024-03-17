package Practice7;
abstract class  MoneyCollector
{
	public abstract void debtor();
}
public class MSon extends MoneyCollector {
public void debtor()
{
	System.out.println("i will give money");
}
public static void main(String[] args) {
	MSon n=new MSon();
	n.debtor();
}
}
