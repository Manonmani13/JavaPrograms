package BasicPrograms_10_11_21;

public class Try4 {
public static void main(String[] args) {
	try
	{
		int data=20/0;
	}
	catch(Exception e)
	{
		System.out.println("Cannot divided by zero");
	}
}
}
//Cannot divided by zero
