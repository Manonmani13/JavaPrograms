package Pratice1;

public class Bank {
public static void main(String args[]) {
	Bank cashier=new Bank();
	cashier.deposit();
	cashier.withdraw();
	Bank customer=new Bank();
	customer.deposit(500);
	customer.deposit("mano");
	customer.deposit(500.5f);
	customer.deposit(500.5);
	customer.deposit(true);
	
}

 void deposit(boolean b) {
	System.out.println(b);
	
}

void deposit(double d) {
	System.out.println(d);
	
}

void deposit(float f) {
	System.out.println(f);
	
}

 void deposit(String name) {
	System.out.println("Account name"+name);
	
}

private void deposit(int i) {
	System.out.println("deposite"+i);
	
}

public void withdraw() {
	System.out.println("withdraw");
}

public void deposit() {
	System.out.println("deposit");
}
}
