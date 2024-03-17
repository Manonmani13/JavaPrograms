package Six6_10_2021;
import java.util.*;

public class Divisor {
Scanner n=new Scanner(System.in);
void divi()
{
	System.out.println("Enter that you want to divide");
	int num1=n.nextInt();
	System.out.println("Enter that you want to divisor");
	int num2=n.nextInt();
	if(num1%num2==0)
	{
		System.out.println("num1 is"+num1+"is divisible by"+num2);
	}
	else
	{
		System.out.println("num1 is"+num1+"is not divisible by"+num2);
	}
}
public static void main(String[] args) {
	Divisor d=new Divisor();
	d.divi();
}
}
