package Practice10;

public class Samusang extends FactoryDemo {
	static int price=5000;
	public static void main(String args[])
	{
	Samusang sam=new Samusang();
	sam.browse();
	System.out.println(sam.price);
	sam.call(40);
	sam.sendMessage();
	sam.receiveCall();
	sam.verifyFingerPrint();
	sam.providePattern();
	}
	int call(int seconds)
	{
	System.out.println("you are spoken to them "+seconds);
	return seconds;
	}
	 void sendMessage()
	 {
	 System.out.println("send message to all");
	 }
	 void receiveCall()
	 {
	 System.out.println("receive calls");
	 }
	 void verifyFingerPrint()
	 {
	 System.out.println("verify Finger Print");
	 }
	void providePattern()
	{
	System.out.println("pattern");
	}
}
