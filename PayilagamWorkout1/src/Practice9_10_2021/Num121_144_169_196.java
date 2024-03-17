package Practice9_10_2021;

public class Num121_144_169_196 {
	//121+23=144 144+
	//11*11=121 12*12=144 13*13=169 14*14=196
	int i=11,j;
	void pro()
	{
		
		while(j<=14)
		{
			
			//j=i*i;
			//System.out.print(j+" ");
			System.out.print((i*i)+" ");
			i++;
			j=i;
		}
	}
public static void main(String[] args) {
	Num121_144_169_196 n=new Num121_144_169_196();
	n.pro();
}
}
