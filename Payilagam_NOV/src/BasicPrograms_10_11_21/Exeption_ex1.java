package BasicPrograms_10_11_21;

public class Exeption_ex1 {
	public static void main(String[] args) {
		int no=10,no1=0;
		try
		{
			System.out.println(no/no1);
		Null_Ex n=new Null_Ex();
		System.out.println(n.hashCode());
		n=null;
		System.out.println(n.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println(" check n");
		}
		catch(ArithmeticException e)
		{
			System.out.println("check value of 2nd number");
		}

	}
}
//check value of 2nd number
