package Oct_18_10_2021;

public class Num80_10_70 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num80_10_70 s=new Num80_10_70();
		s.Series();
	}

	public void Series() {
		// TODO Auto-generated method stub
		//80 10 70 15 60 20
		int n=80,n1=10,count=0;
		while (count<3) {
			System.out.print(n+" ");
			System.out.print(n1+" ");
			n=n-10;
			n1=n1+5;
			count++;
		}
}
}
