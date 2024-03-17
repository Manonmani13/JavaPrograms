package Practice9_10_2021;
import java.util.Scanner;
public class Demo {
		//15*2+1=31  31*2+1=63 63*2+1=127 127*2+1=255
		void num(int n, int k) {
			
			while(n<=k)
		
		{
		System.out.print(n+" ");
		n=((n*2)+1);
		
		}	 
		}	
	public static void main(String[] args) {
		int n;
		int k;
		Demo d=new Demo();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value for n: ");
		n=sc.nextInt();
		System.out.println("Enter value limit : ");
		k=sc.nextInt();
		//d.num(n,k);
		while(n<=k) //----> Option to run form main
		{
		System.out.print(n+" ");
		n=((n*2)+1);
		}
		
		
		
	}
	} 

