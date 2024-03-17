package Practice9_10_2021;

public class Num1_3_4_8_15_27 {
	//1+3=4   1+3+4=8 3+4+8=15 15+8+4=27
	int i=1,j=3,k=4,sum;
	void num()
	{
		System.out.print(i+" ");
		System.out.print(j+" ");
		System.out.print(k+" ");
		while(k<27) {
			sum=i+j+k;
			System.out.print(sum+" ");
			i=j;
			j=k;
			k=sum;	
		}
	}
public static void main(String[] args) {
	Num1_3_4_8_15_27 n=new Num1_3_4_8_15_27();
	n.num();
}
}
