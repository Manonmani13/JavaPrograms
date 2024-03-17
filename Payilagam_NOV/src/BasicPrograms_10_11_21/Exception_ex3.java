package BasicPrograms_10_11_21;

public class Exception_ex3 {
	public static void main(String[] args) {
		int no=10,no1=0;
		try
		{
			
			try
			{
				int []ar=new int[-1];
			}
			catch(Exception e)
			{
	
				System.out.println("Array Check");
			}
			System.out.println(no/no1);
		Null_Ex n=new Null_Ex();
		System.out.println(n.hashCode());
		n=null;
		System.out.println(n.hashCode());
		}
		catch(Exception e)
		{
			System.out.println(" check n");
		}
		
}
}/*
Array Check
 check n

*/