package Practice9_10_2021;

public class Num11_13_17 {
//11_13_17_19_23
	//11+2=13 13+4=17 17+2=19 19+4=23
	int i=11,j=2,k,c=1;
	void pro()
	{
		while(c<=3)
		{
		System.out.print(i+" ");
		k=i+j;
		if(c==3)
		{
			break;
		}
		System.out.print(k+" ");
		k=k+j+j;	
		i=k;	
		c++;
		}
	}
	public static void main(String[] args) {
		Num11_13_17 n=new Num11_13_17();
		n.pro();
	}
}
