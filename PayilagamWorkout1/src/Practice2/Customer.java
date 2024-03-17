package Practice2;

public class Customer {
	String name;
	int ph;
	int dob;
	String vot;
	String add;
	String mai;
	
	public Customer(String name, int ph, int dob, String add) {
		this.name=name;
		this.ph=ph;
		this.dob=dob;
		this.add=add;
	}

	public Customer(String name, int ph, int dob, String address, String mai, String vot) {
		this.name=name;
		this.ph=ph;
		this.dob=dob;
		this.add=add;
		this.mai=mai;
		this.vot=vot;
	}

	public Customer(String string, int i, String string2) {
		this.name=name;
		this.ph=ph;
		this.add=add;
	}

	public static void main(String[] args){

		Customer cus1=new Customer("sara",97,065,"address");
		Customer cus2=new Customer("santhiya",9887,905,"address","mailm","vot");
		Customer cus3=new Customer("sara",987,"address");
		Bank1 db=new Bank1();
		db.update(cus1);	
		db.update(cus2);
		db.update(cus3);	
		}
}
