package Oct_17_10_2021;

public class Series {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series s=new Series();
		s.prac_7_10_8_11_9_12_10();
	}
	public void prac_7_10_8_11_9_12_10() { 
		int n1=7,n2=10;
		while (n1<=10){
			System.out.print(n1+" ");
			if(n1>=10) {
				break;
			}
			System.out.print(n2+" ");
			n1=n1+1;
			n2=n2+1;
		}

	}
}

