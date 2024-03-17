package Practice10;

abstract public class Smartphone {
	abstract int call(int seconds);
	 abstract void sendMessage();
	 abstract void receiveCall();
	  void browse()
	 {
	 System.out.println("SmartPhone browsing");
	 }
	 public Smartphone()
	{
	System.out.println("Smartphone under development");
	}
}
