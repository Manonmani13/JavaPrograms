package Practice9_10_2021;

public class Num3_7_16_35 {
	//3*2+1=7 7*2+2=16 16*2+3=35
	int n=3,i=1;
	void pro()
	{
		while(n<=35)
		{
			System.out.print(n+" ");
			n=n*2+i;
			i++;
			
			
		}
	}
public static void main(String[] args) {
	Num3_7_16_35 n=new Num3_7_16_35();
	n.pro();
}
}
