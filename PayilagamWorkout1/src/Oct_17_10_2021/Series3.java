package Oct_17_10_2021;

public class Series3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series3 s=new Series3();
		s.prat_53_53_40_40_27_27_14();
	}
	public void prat_53_53_40_40_27_27_14() { 
		int n1=53;
		while (n1>=14) {
			System.out.print(n1+" ");
			if (n1==14) {
				break;
			}
			System.out.print(n1+" ");
			n1=n1-13;
		}
}
}
