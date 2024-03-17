package BasicPrograms_10_11_21;

public class Throw2 {
public static void main(String[] args) {
	Throw2 n=new Throw2();
	try {
		System.out.println(n.div(30,0));
	}
	catch(ArithmeticException e)
	{
		System.out.println("number cannot be divided by zero");
	}
	
}
public int div(int m,int n)throws ArithmeticException{
	int d=m/n;
	return d;
}
}
//number cannot be divided by zero
