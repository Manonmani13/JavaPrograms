package BasicPrograms_10_11_21;

public class Exception_ex5 {
	public static void main(String[] args) {
		int no=10,no1=0;
		try
		{

			System.out.println(no/no1);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Chek no1 values");
			try {
				System.out.println(no/no1);
			}
			catch(Exception v){
				System.out.println("check");
			}
		}
		finally
		{
			try {
				System.out.println(no/no1);
			}
			catch(Exception e){
				System.out.println("catch final");
			}
		
			System.out.println("clearing data");
		}
		
}
}
/*
Chek no1 values
check
catch final
clearing data

*/