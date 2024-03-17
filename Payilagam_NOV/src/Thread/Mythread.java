package Thread;

public class Mythread extends Thread{
public void  run() {
	
	for(int i=1;i<=5;i++)
	{
		//Thread.yield();
		try {
			Thread.sleep(2000);
			System.out.println("Mythread");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("someone is interrupted");
		}
		//System.out.println(Thread.currentThread().getState());
		//System.out.println("Mythread");
	}
}



}
