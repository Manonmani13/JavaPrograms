package BasicPrograms_10_11_21;

public class Exception_ex4 {
	public static void main(String[] args) {
		int no=10,no1=0;
		try
		{

			System.out.println(no/no1);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Chek no1 values");
		}
		finally
		{
			System.out.println("clearing data");
		}
		
}
}
/*
Chek no1 values
clearing data

*/
