package Thread;

public class MultithreadingDemo {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	ThreadChid tc=new ThreadChid();
	System.out.println(tc.getState());
	tc.start();
	System.out.println(tc.getState());
	ThreadChid tc2=new ThreadChid();
	tc2.start();
	System.out.println(tc2.getState());
//	System.out.println(tc.getId());
//	System.out.println(tc.getName());
//	System.out.println(tc.getPriority());
//	System.out.println(tc.getClass());
//	System.out.println(tc.getState());
//	System.out.println(Thread.MAX_PRIORITY);
//	System.out.println(Thread.MIN_PRIORITY);
//	System.out.println(Thread.NORM_PRIORITY);
//	tc.setPriority(1);
//	System.out.println(tc.getPriority());
//	//tc.run();
	System.out.println(tc.getState());
	MultithreadingDemo mtd =new MultithreadingDemo();
	mtd.display();
	System.out.println(tc.getState());
}

private void display() {

		for(int i=1;i<=5;i++)
		{
			System.out.println("Mtd"+i);
		}
	
	

}
}
