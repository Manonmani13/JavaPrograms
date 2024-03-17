package BasicPrograms_10_11_21;

public class Arith_Ex2 {
public static void main(String[] args) {
	int no=10,no1=0;
	try
	{
		System.out.println(no/no1);
	}
	catch(ArithmeticException e)
	{
		System.out.println("check value of 2nd number");
	}
}
}
//check value of 2nd number
