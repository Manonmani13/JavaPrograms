package Accessmodifiers;

public class AbstractMEthod extends vechicle {
//we dont know abut implementatation then we should go with abstract method 
	public int getNoOfwheels()
	{
		return 7;
	}
	//we canot give final native synchronized static privte strictfb for abstract
	
}
abstract class vechicle
{
	abstract public int getNoOfwheels();
}