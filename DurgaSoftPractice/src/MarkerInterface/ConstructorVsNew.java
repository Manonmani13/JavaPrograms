package MarkerInterface;

public class ConstructorVsNew {
	String name;
	int roll;
public ConstructorVsNew(String name,int roll) {
	// TODO Auto-generated constructor stub
	this.roll=roll;
	this.name=name;
	/*
	 * used to intialize the values ->
	 * used to create object->new
	 */
}
public static void main(String[] args) {
	ConstructorVsNew n=new ConstructorVsNew("mano", 88);
}
}
