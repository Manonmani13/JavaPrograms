package Oct_17_10_2021;

public class Series4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series4 s=new Series4();
		s.pract_3_4_7_8_11_15();
	}
	public void pract_3_4_7_8_11_15() { 
		int n=3,n1=4;
		while (n<=15) {
			System.out.print(n+" ");
			if (n>=15||n1==12) {
				break;
			}
		
			System.out.print(n1+" ");
			n=n+4;
			n1=n1+4;
		}
}
}
