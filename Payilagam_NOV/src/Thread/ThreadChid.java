package Thread;

public class ThreadChid extends Thread {
public void  run(int k)
{
	for(int i=1;i<=5;i++)
	{
		System.out.println("Tc"+i);
	}
}
public void start() { // overriding the start() method
    System.out.println("Overriding a start() method");
    super.start();
 }
}
