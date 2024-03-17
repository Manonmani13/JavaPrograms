package Practice9_10_2021;

public class Num15_31_63_127_255 {
	//15*2+1=31  31*2+1=63 63*2+1=127 127*2+1=255
	int n=15;
	void num()
	{
		while(n<=255)
		{
		System.out.print(n+" ");
		n=((n*2)+1);
		
		}
	}
	void demo()
	{
		int i = 15;
		System.out.print(i + " ");
		while (true) {
			int k = (i * 2) + 1;
			System.out.print(k + " ");
			
			if (k >= 255) {    // -----> choice
				break;
			} 
			i = k;
		}
	} 
public static void main(String[] args) {
	Num15_31_63_127_255 n=new Num15_31_63_127_255();
	//n.num();
	n.demo();
}
}
