package Practice10;
class statebank
{
	private int balance=1000;
	int getbalance()
	{
		return balance;
	}
	public void setbalance(int amount)
	{
		this.balance=this.balance+amount;
	}
	
}
public class SbiCustomer {
public static void main(String[] args) {
	statebank s=new statebank();
	System.out.println(s.getbalance());
	s.setbalance(500);
	System.out.println(s.getbalance());
}
}
