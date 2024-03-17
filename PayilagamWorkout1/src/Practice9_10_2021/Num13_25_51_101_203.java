package Practice9_10_2021;

public class Num13_25_51_101_203 {
	//13*2=26-1 =25 25*2+1=51 51*2=102-1=101 101*2+1=203
	int n=13;
	int k;
	void print()
	{
		while(k<=203)
		{
			
		System.out.print(n+" ");
		
		
		k=(n*2)-1;
		if(n>=203)
		{
			break;
		}
		System.out.print(k+" ");
		n=(k*2)+1;
		}
		
		
	}
public static void main(String[] args) {
	Num13_25_51_101_203 n=new Num13_25_51_101_203();
	n.print();
}
}
