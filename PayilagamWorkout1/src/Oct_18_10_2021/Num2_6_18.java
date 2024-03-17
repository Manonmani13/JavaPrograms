package Oct_18_10_2021;

public class Num2_6_18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num2_6_18 s=new Num2_6_18();
		s.Series();
	}

	public void Series() {
		// TODO Auto-generated method stub
		//2 6 18 54 162
		int n=2,count=0;
		while (count<5) {
			System.out.print(n+" ");
			n=n*3;
			count++;
		}
}
}