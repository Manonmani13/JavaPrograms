package Practice5;

public class Rbi {
private int accountbalance=1000;
public int getaccountbalance()
{
	return accountbalance;
}
public static void main(String[] args) {
	Rbi r=new Rbi();
	
	System.out.println(r.getaccountbalance());
}
}
