package Practice9_10_2021;

public class Num165_195_255_285_345 {
	//165+30=195 195+60=255 255+30=285 285+60=345
	int i=165;
	void pro()
	{
	while(i<=345)
	{
		System.out.print(i+" ");
		i=i+30;
		if(i>=345)
		{
			break;
		}
		System.out.print(i+" ");
		i=i+60;
		
	}
		
	}
public static void main(String[] args) {
	Num165_195_255_285_345 n=new Num165_195_255_285_345();
	n.pro();
}
}
