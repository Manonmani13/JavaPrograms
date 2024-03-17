package Practice2;

public class Bank {
static int bankbalance=1000;
int balance=0;
public static void main(String[] args) {
	Bank customer=new Bank();
	customer.deposit(1000);
	Bank customer1=new Bank();
	customer1.balance=500;
	Bank customer2=new Bank();
	customer2.balance=1500;
	System.out.println(Bank.bankbalance);
	System.out.println(customer1.balance);
	System.out.println(customer2.balance);
}
private void deposit(int amount) {
	System.out.println("Deposit"+amount);
	
}
}
