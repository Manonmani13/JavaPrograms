package Oct_17_10_2021;

public class Series9 {
	public static void main(String[] args) {
		
		Series9 s=new Series9();
		s.Series();
	}

	public void Series() {
		// TODO Auto-generated method stub
		int n=31;
		while (n>=15) {
			System.out.print(n+" ");
			n=n-2;
			System.out.print(n+" ");
			n=n-5;
		}
}
}
