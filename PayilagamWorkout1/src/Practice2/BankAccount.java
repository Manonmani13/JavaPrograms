package Practice2;

public class BankAccount extends CreateAccount {
	public void delete() {
		System.out.println("delete account");
		
	}

	public void create() {
		System.out.println("create account");
		
	}
	void Account()
	{
		System.out.println("account owner");
	}
	public static void main(String args[])
	{
		CreateAccount ba=new BankAccount();
		ba.create();
		//ba.Account();
		ba.delete();
	}
}
