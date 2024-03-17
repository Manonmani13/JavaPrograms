package Oct_17_10_2021;

public class Series12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series12 s= new Series12();
		s.Series();

	}

	public void Series() {
		// TODO Auto-generated method stub
		// 14 28 20 40 32 64 56
		int n=14,count=0;
		while (count<4) {
			System.out.print(n+" ");
			if (n==56) {
				break;
			}
			n=n*2;
			System.out.print(n+" ");
			n=n-8;
			count++;
		}
}
}
