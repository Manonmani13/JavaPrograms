package bank.icic.deposit;


public class Trainer {
	String dept="java",intstitude="payilagam";
	private int salary=10000;
	public int getSalary()
	{
		
		return salary;
	}
	Trainer(String dept,String intstitude)
	{
		this.dept=dept;
		this.intstitude=intstitude;
		System.out.println(dept+"\n"+intstitude);
	}
public static void main(String[] args) {
		Trainer t=new Trainer("CSE","Payilagam");
	
}
public void training()
{
	System.out.println("provide good training");
	
}
}
