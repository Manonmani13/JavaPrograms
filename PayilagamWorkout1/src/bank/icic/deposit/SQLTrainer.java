package bank.icic.deposit;

public class SQLTrainer extends Trainer{
SQLTrainer(String dept, String intstitude) {
		super(dept, intstitude);
	
	}

public static void main(String[] args) {
	SQLTrainer s=new SQLTrainer("JAVA", "Payilagam");
	System.out.println(s.dept+"\n"+s.intstitude);
	s.getSalary();
	s.training();
}
}
