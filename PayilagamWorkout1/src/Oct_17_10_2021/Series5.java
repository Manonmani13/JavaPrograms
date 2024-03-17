package Oct_17_10_2021;

public class Series5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series5 s=new Series5();
		s.prac_22_21_23_22_24_23_25();
	}
	public void prac_22_21_23_22_24_23_25() { 
		int n1=22,n2=21;
		while (n1<=25){
			System.out.print(n1+" ");
			if(n1>=25) {
				break;
			}
			System.out.print(n2+" ");
			n1=n1+1;
			n2=n2+1;
		}
}
}
