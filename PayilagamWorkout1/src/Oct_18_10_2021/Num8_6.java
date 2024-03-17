package Oct_18_10_2021;

public class Num8_6 {
	public static void main(String[] args) {
		Num8_6 s=new Num8_6();
		s.Series();
	}

	public  void Series() {
		// TODO Auto-generated method stub
		//8 6 9 23 87 429
		int n=8,i=1,k=2,count=0;
		System.out.print(n+" ");
		while (count<5) {
			n=n*i;//12
			n=n-k;//9
			System.out.print(n+" ");//9
			i++;
			k++;
			count++;
		}
}
}
