package workout13_10_2021;

public class Multple_while2 {
	public static void main(String[] args) {
		int n=1;
		int total=1,total1=1;
		do
		{
			total=total*n;
			
			
			n++;
		}while(n<=5);
		System.out.println(total);
		System.out.println("reverse");
		int j=5;
		do
		{
			
			total1=total1*j;
			
			
			j--;
		}while(j>=1);
		System.out.println(total1);
	}
}
