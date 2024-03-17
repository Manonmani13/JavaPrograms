package Thread;

public class MythreadMain {
public static void main(String[] args) throws InterruptedException {
	Mythread t=new Mythread();
	t.start();
	//t.join();
	t.interrupt();
	MythreadMain td=new MythreadMain();
	td.display();
	
}
public void display() {
	
for(int i=1;i<=5;i++)
{
	System.out.println("Thread Main");
}
}
}

