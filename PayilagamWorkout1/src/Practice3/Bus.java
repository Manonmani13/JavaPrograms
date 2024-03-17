package Practice3;

public class Bus {
	String name;
	int id;

	public Bus(int i, String string) {
		System.out.println(i+string);
	}

	public Bus() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor");
	}

	public Bus(Bus ti) {
		System.out.println(ti);
	}

	public static void main(String args[])
	{
	new Bus().getTicket();
		Bus ti=new Bus(10,"mano");
		Bus tick=new Bus(ti);
		tick.id=ti.id;
		tick.name=ti.name;
		tick.display();
		tick.add(10l,4);
		ti.getTicket();
		System.out.println(args);
	}

	private void display() {
		System.out.println("hello");
	}

	private void add(long l, int i) {
		System.out.println(l+" "+i);
	}

	private void getTicket() {
		// TODO Auto-generated method stub
		System.out.println("give ticket");
	}
}
