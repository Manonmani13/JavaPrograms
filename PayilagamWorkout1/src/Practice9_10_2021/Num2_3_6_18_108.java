package Practice9_10_2021;

public class Num2_3_6_18_108 {
	// 2*3=6 6*3=18 18*6=108
	int n=2,i=3,j;
	void pro()
	{
		
		System.out.print(n+" "+i+" ");
		while(j<108)
		{
		j=n*i;
		System.out.print(j+" ");
		/*if(j>=108)
		{
			break;
		}*/
		n=i;
		i=j;
		}
		
		
	}
public static void main(String[] args) {
	Num2_3_6_18_108 n=new Num2_3_6_18_108();
	n.pro();
}
}
